/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorsql;

/**
 *
 * @author user
 */
public class NuestroVisitor<T> extends GramaticaBaseVisitor{

    @Override
    public T visitValue(GramaticaParser.ValueContext ctx) {
        
        return (T)visitChildren(ctx);
    }

    @Override
    public Object visitEntero(GramaticaParser.EnteroContext ctx) {
        boolean bNeg=false;
        if(ctx.MINUS()!=null){
            bNeg=true;
        }
        
        ctx.NUM();
        return super.visitEntero(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitDecimal(GramaticaParser.DecimalContext ctx) {
        return super.visitDecimal(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFecha(GramaticaParser.FechaContext ctx) {
        return super.visitFecha(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCharacter(GramaticaParser.CharacterContext ctx) {
        return super.visitCharacter(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
