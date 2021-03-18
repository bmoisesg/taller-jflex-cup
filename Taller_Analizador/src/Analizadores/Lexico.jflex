/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;
/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
    //Crearemos una linkedlist para ir guardando los errores léxicos
    public static LinkedList<Error> TablaEL = new LinkedList<Error>();
%}

//-------> Directivas
%public 
%class ALexico
%cupsym sym
%cup
%char
%column
%full
%ignorecase
%line
%unicode


//------> ER de palabras reservadas
numero= [0-9]+
%%

/*------------  3ra Area: Reglas Lexicas ---------*/
//-------------> sym
<YYINITIAL> "+"         {
                        return new Symbol(sym.mas, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "-"         {
                        return new Symbol(sym.menos, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "*"         {
                        return new Symbol(sym.por, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "/"         {
                        return new Symbol(sym.dividido, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "^"         {
                        return new Symbol(sym.pow, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "%"         {
                        return new Symbol(sym.mod, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "("         {
                        return new Symbol(sym.abrir_par, yycolumn, yyline, yytext());
                        }       
<YYINITIAL> ")"         {
                        return new Symbol(sym.cerrar_par, yycolumn, yyline, yytext());
                        }   
//------>sym ER                                             
<YYINITIAL> {numero}    {
                        return new Symbol(sym.numero, yycolumn, yyline, yytext());
                        }

//------> Espacios
[ \t\r\n\f]            {/*Espacios en blanco, se ignoran */}


//------> Errores Lexicos
.                       { 
                            System.out.println("----------Error Léxico "+yytext()+"--------------");
                            System.out.println("Linea: "+ yyline + "  Columna:  "+ yycolumn);
                            Error datos = new Error(yytext(), yyline, yycolumn, "Error Léxico", "Simbolo no existe en el lenguaje");
                            TablaEL.add(datos);
}
                        