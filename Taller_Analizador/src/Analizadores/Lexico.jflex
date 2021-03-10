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
%cupsym Simbolos
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
//-------------> Simbolos
<YYINITIAL> "+"         {
                        return new Symbol(Simbolos.mas, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "-"         {
                        return new Symbol(Simbolos.menos, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "*"         {
                        return new Symbol(Simbolos.por, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "%"         {
                        return new Symbol(Simbolos.pow, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "("         {
                        return new Symbol(Simbolos.abrir_par, yycolumn, yyline, yytext());
                        }       
<YYINITIAL> ")"         {
                        return new Symbol(Simbolos.cerrar_par, yycolumn, yyline, yytext());
                        }   
//------>Simbolos ER                                             
<YYINITIAL> {numero}    {
                        return new Symbol(Simbolos.numero, yycolumn, yyline, yytext());
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
                        