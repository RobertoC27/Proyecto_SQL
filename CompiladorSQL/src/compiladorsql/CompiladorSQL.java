/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorsql;

import java.util.ArrayList;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author user
 */
public class CompiladorSQL {

    private GramaticaParser parser;
    //este comentario es para llenar espacio
    private ParseTree tree;
    private NuestroVisitor mv;
    
    public ArrayList nombre(String txt){
        System.out.println("");
        ANTLRInputStream in = new ANTLRInputStream(txt);
        GramaticaLexer lexer = new GramaticaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new GramaticaParser(tokens);
        tree = parser.sqlProgram();
        
        mv= new NuestroVisitor();
        mv.visit(tree);
        
        return mv.getErrores();
    }

    public void mostrarArbol(){
        Trees.inspect(tree, parser);
    }
            
    
    
    
}
