/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author moi
 */


import Analizadores.*;
import java.io.BufferedReader;
import java.io.StringReader;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ejecutar el analisis lexico        
        ALexico lexico = new ALexico(new BufferedReader(new StringReader("@1+false")));
        ASintactico sintactico = new ASintactico(lexico);
        
        try {
            //ejecutar el analisis sintactico
            sintactico.parse();
            
            //imprimir lor errores lexicos, sintacticos y semanticos
            for (TError x : lexico.TablaEL) {
                 System.out.println(x.get());
            }
            for (TError x : sintactico.erroresSintacticos) {
                System.out.println(x.get());
            }
                 
        } catch (Exception e1) {
            System.out.println("Error al dar parser al analisis");
        }
        
        
    }
    
}
