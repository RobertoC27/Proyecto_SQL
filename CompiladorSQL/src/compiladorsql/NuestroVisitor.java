/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorsql;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class NuestroVisitor<T> extends GramaticaBaseVisitor{

    private String dirBase="Bases de Datos\\",dirActual="";
    private ArrayList<String> errores,
            metaDataGENERALDBnames,
            metaDataLOCALTBnames;
    
    private ArrayList metaDataGENERALDBnumTablas,
            metaDataLOCALTBelementosNum;
    
    private ArrayList<ArrayList<String>> metaDataLOCALTBcolumnas,
            metaDataLOCALTBtipos;
    
    private boolean verbose=false,
            bUse=false;
    private String hb="";

    @Override
    public T visitSqlProgram(GramaticaParser.SqlProgramContext ctx) {
        this.errores=new ArrayList();
        this.metaDataGENERALDBnames=new ArrayList();
        this.metaDataLOCALTBnames=new ArrayList();
        this.metaDataGENERALDBnumTablas=new ArrayList();
        this.metaDataLOCALTBelementosNum=new ArrayList();
        this.metaDataLOCALTBcolumnas=new ArrayList();
        this.metaDataLOCALTBtipos=new ArrayList();
        
        return (T)visitChildren(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public T visitCrearDB(GramaticaParser.CrearDBContext ctx) {
        File dir = new File(dirBase+ctx.ID().getText());
        
        revVerb("Revisando que la DB no exista ya para poder crearla");
        if(dir.isDirectory()){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), genera una DB ya existente ");
            
            return (T)"error al tratar crear DB ya existente";
            
        }else{
//            System.out.println("EL folder para la db NO existe");
            //trata de crear el directorio
            boolean successful = dir.mkdir();
            if (successful){
                
                
//                AGREGAR LA NUEVA DB A LA METADATA GENERAL PARA SU USO
                this.metaDataGENERALDBnames.add(ctx.ID().getText());
                this.metaDataGENERALDBnumTablas.add(0);
                revVerb("Folder para dB creado exitosamente");
                
            }else{
                this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), no se puede crear el directorio especificado");
                revVerb("Folder para la DB no creado");
                
                return (T)"error al tratar crear DB ";
            }
        }
        
        
        return (T)""; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T visitAlterarDB(GramaticaParser.AlterarDBContext ctx) {
        //VER SI LA DB QUE QUIERO RENOMBRAR YA EXISTE
        File old = new File(dirBase+ctx.ID(0));
        
        revVerb("revisar que la db ya exista para poder renombrar");
        if(!old.isDirectory()){
            revVerb("DB no existe para ser renombrada");
            
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), no se puede renombrar la DB:"+ctx.ID(0)+" que no existe");
            return (T)"error al renombrar una DB que no existe";
        }
        
//        CAMBIAR EL NOMBRE DE LA DB EN LOS LUGARES BASICOS
        File nuevo = new File(dirBase+ctx.ID(1));
        if(old.renameTo(nuevo)){
            revVerb("DB renombrada exitosamente");
            if(this.dirActual.equals(this.dirBase+ctx.ID(0))){
                this.dirActual=this.dirBase+ctx.ID(1);
            }
            //reemplazar el nombre en la metadata
            this.metaDataGENERALDBnames.set(this.metaDataGENERALDBnames.indexOf(ctx.ID(0).getText()), ctx.ID(1).getText());
        }else{
            revVerb("DB no pudo ser renombrada");
        }
        
        
        /************************************
            FALTA EL PROCEMIENTO PARA LAS TABLAS
        ************************************/
        
        return (T)"";
    }

    @Override
    public T visitUsarDB(GramaticaParser.UsarDBContext ctx) {
        this.bUse=true;
        File old = new File(dirBase+ctx.ID());
        
        revVerb("Revisando que la DB exista para ser usada");
        if(!old.isDirectory()){
            revVerb("La DB buscada no existe");
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), no se puede usar la DB:"+ctx.ID()+" porque no existe");
            return(T)"error buscando la DB para uso";
        }
        revVerb("La DB buscada si existe");
        System.out.println("USANDO: "+old.getAbsolutePath());
        this.dirActual=dirBase+ctx.ID();
        
        return(T)""; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public T visitEliminarDB(GramaticaParser.EliminarDBContext ctx) {
        File old = new File(dirBase+ctx.ID());
        revVerb("Revisando que la DB exista para ser eliminada");
        
        if(!old.isDirectory()){
            revVerb("La DB buscada no existe");
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), no se puede eliminar la DB:"+ctx.ID()+" porque no existe");
            return(T)"error buscando la DB para uso";
        }
        
        
        /***********************************
        *FALTA HACER EL PROCEDIMIENTO PARA ELIMINAR LA BASE DE DATOS EN LA PRÁCTICA
        ************************************/
        
        
        
        
        
        /*
        **********************************
        *ELIMINAR LA DB DE LA METADATA, ESTO VA DESPUES DE HACER LOS PROCEDIMIENTOS
        ***********************************
        */
        int index=this.metaDataGENERALDBnames.indexOf(ctx.ID().getText());
        this.metaDataGENERALDBnumTablas.remove( index );
        this.metaDataGENERALDBnames.remove(index);
        
        return (T)"";
    }

    @Override
    public T visitMostrarDB(GramaticaParser.MostrarDBContext ctx) {
        for (String name : this.metaDataGENERALDBnames) {
            System.out.println("DB------>"+name);
        }
        
        /*********************
         FALTA MOSTRARLOS DE UNA MANERA ELEGANTE
         **********************/
        
        
        return (T)"";
    }

    @Override
    public T visitCrearTB(GramaticaParser.CrearTBContext ctx) {
        this.revVerb("revisar si hay una DB en uso para crear la tabla");
        if(!this.bUse){
            revVerb("no hay DB seleccionada");
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), no pueder crear una tabla porque no hay DB seleccionada");
            return (T)"error porque no hay DB elegida";
            
        }
        /*****************************
         * FALTA CRAR EL ARRAYLIST CON LAS CONSTRAINTS
        *****************************/
        
        
        /****************************
            CREADA LA METADATA DE LA TABLA PARA LA DB ACTUAL
            * FALTA CREAR LOS ARCHIVOS PARA ESTA TABLA EN ESPECIFICO
            * FALTA VALIDAR QUE LA TABLA CREADA NO HAYA ESTE SIENDO DUPLICADA
        *****************************/
        
        
        // AGREGO EL NOMBRE DE LA TABLA A LA METADATA DE LA BASE DE DATOS EN USO
        this.metaDataLOCALTBnames.add(ctx.ID().getText());
        
//        BUSCAR EL INDICE DE LA TABLA RECIEN AGREGADA
        int ind=this.metaDataLOCALTBnames.indexOf(ctx.ID().getText());
        

//  LLENAR LA INFO DE LAS COLUMNAS EN LA METADATA LOCAL
        for (int i = 0; i < ctx.columna().size(); i++) {
            
        //obtener el id y el tipo de la columna para meterlo a la metaDATA local
            String data=(String)visit(ctx.columna(i));
            
            //separar el id y el tipo para agregarlos a las distintas listas
            String[] split = data.split(",");
            
//            AGREGO LAS NUEVAS POSICIONES QUE VOY A NECESITAR MAS ADELANTE
            this.metaDataLOCALTBcolumnas.add(new ArrayList());//.get(i).add(split[0]);
            this.metaDataLOCALTBtipos.add(new ArrayList());//.add(split[1]);
            
//            AGREGO EL EL NOMBRE Y TIPO DE LA COLUMNA EN LA POSICION CORRESPONDIENTE A LA TABLA
            this.metaDataLOCALTBcolumnas.get(ind).add(split[0]);
            this.metaDataLOCALTBtipos.get(ind).add(split[1]);
            
        }
        
        //SE ASIGNA ESTA VARIBLE PARA QUE FUNCIONE BIEN LA BUSQUEDA
        hb=dirActual.substring(dirActual.indexOf("\\")+1);

        int indi=this.metaDataGENERALDBnames.indexOf( hb );

        //aumentar el contador de tablas en el metadata
        int cont=(int)this.metaDataGENERALDBnumTablas.get( indi );
        cont++;
        this.metaDataGENERALDBnumTablas.set(indi, cont);
        
        
        return (T)"";
    }

    @Override
    public T visitColumna(GramaticaParser.ColumnaContext ctx) {
        String td=ctx.ID().getText()+","+visit(ctx.type());
        return (T)td;
    }

    @Override
    public T visitTipoChar(GramaticaParser.TipoCharContext ctx) {
        String t="char("+ctx.NUM()+")";
        return (T)t;
    }

    @Override
    public T visitTipoEntero(GramaticaParser.TipoEnteroContext ctx) {
        return (T)"int";
    }

    @Override
    public T visitTipoDAte(GramaticaParser.TipoDAteContext ctx) {
        return (T)"date";
    }

    @Override
    public T visitTipoFloat(GramaticaParser.TipoFloatContext ctx) {
        return (T)"float";
    }
    
    
    
    @Override
    public T visitValue(GramaticaParser.ValueContext ctx) {
        
        return (T)visitChildren(ctx);
    }

    @Override
    public T visitEntero(GramaticaParser.EnteroContext ctx) {
        return(T) ctx.getText();
        /*boolean bNeg=false;
//        REVISASR SI EL NUMERO ES NEGATIVO
        if(ctx.MINUS()!=null){
            bNeg=true;
        }
        
        if(bNeg){
            String gt="-"+ctx.NUM().getText();
            return (T)gt;
        }else{
            return (T)ctx.NUM().getText();
        }*/
        
    }
    
    @Override
    public T visitDecimal(GramaticaParser.DecimalContext ctx) {
        /*boolean bNeg=false;
        int pEnt=Integer.parseInt((String)visit(ctx.entero()));
        float numF=pEnt+Integer.parseUnsignedInt("0."+ctx.NUM().getText());*/
        return (T)ctx.getText(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T visitFecha(GramaticaParser.FechaContext ctx) {
        System.out.println("FECHA VISITADA->"+ctx.getText());
        
        
//        OBTENER LOS NUMEROS DE LA FECHA INGRESADA
//        SE USA UNSIGNEDINT PORQUE LOS NUMEROS SON TODOS POSITIVOS 

        int year=Integer.parseUnsignedInt(ctx.getText().substring(1, 5));
        int month=Integer.parseUnsignedInt(ctx.getText().substring(6, 8));
        int day=Integer.parseUnsignedInt(ctx.getText().substring(9,11));
        //REVISAR QUE EL MES SEA VALIDO
        if(month>12){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), Los meses no deben ser mayores a 12");
            return(T)"error en el numero de mes";
        }
        
        //REVISAR QUE EL DIA SEA VALIDO
        if(day>31){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), Los meses no deben tener mas de 31 dias");
            return(T)"error en el numero de dia";
        }
        
        //REVISAR QUE EL CASO ESPECIAL DE FEBRERO
        if(month==2 && day>29){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+"), Febrero no puede tener mas de 29 dias");
            return(T)"error en la el dia de febrero";
        }
        
        return (T)ctx.getText(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public T visitCharacter(GramaticaParser.CharacterContext ctx) {
        return (T)ctx.getText();
    }

    public ArrayList<String> getErrores() {
        return this.errores;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
    /*
        metodo para imprimir mensajes en consola si la opcion Verbose es activada
    */
    public void revVerb(String mensaje){
        if(verbose){
            System.out.println(mensaje);
        }
    }
    
    public void getMDglob(){
        
        String tN="DB's->[",tT="# Tablas->[";
        for (int i = 0; i < this.metaDataGENERALDBnames.size(); i++) {
            tN+=this.metaDataGENERALDBnames.get(i)+",";
            tT+=this.metaDataGENERALDBnumTablas.get(i)+",";
        }
        tN+="]";
        tT+="]";
        
        System.out.println(tN);
        System.out.println(tT);
        
        //return tN;
    }

    public void getMDloc(){
        String tTabla="",tColumnas="",tTipos="";
        
        tTabla=this.metaDataLOCALTBnames.toString();
        tColumnas=this.metaDataLOCALTBcolumnas.toString();
        tTipos=this.metaDataLOCALTBtipos.toString();
        
        System.out.println("TABLAS->"+tTabla);
        System.out.println("COLUMNAS->"+tColumnas);
        System.out.println("TIPOS->"+tTipos);
    }
}
