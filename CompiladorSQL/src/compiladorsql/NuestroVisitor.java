/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorsql;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class NuestroVisitor<T> extends GramaticaBaseVisitor{

    private ArrayList<String> errores=new ArrayList();
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
    public Object visitFecha(GramaticaParser.FechaContext ctx) {
//        OBTENER LOS NUMEROS DE LA FECHA INGRESADA
//        SE USA UNSIGNEDINT PORQUE LOS NUMEROS SON TODOS POSITIVOS 
        System.out.println("FECHA VISITADA->"+ctx.getText());
        int year=Integer.parseUnsignedInt(ctx.getText().substring(1, 5));
        int month=Integer.parseUnsignedInt(ctx.getText().substring(6, 8));
        int day=Integer.parseUnsignedInt(ctx.getText().substring(9,11));
        if(month>12){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+") Los meses no deben ser mayores a 12");
            return(T)"error en el numero de mes";
        }
        if(day>31){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+") Los meses no deben tener mas de 31 dias");
            return(T)"error en el numero de dia";
        }if(month==2 && day>29){
            this.errores.add("La linea:"+ctx.start.getLine()+", ("+ctx.getText()+") Febrero no puede tener mas de 29 dias");
            return(T)"error en la el dia de febrero";
        }
        
        return (T)ctx.getText(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public T visitCharacter(GramaticaParser.CharacterContext ctx) {
        return (T)ctx.getText();
    }

    public ArrayList<String> getErrores() {
        return errores;
    }

    
    
    
}
