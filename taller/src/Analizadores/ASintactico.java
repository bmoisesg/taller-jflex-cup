
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ASintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ASintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ASintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ASintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\004\005\000\002\004\005\000\002\004\003" +
    "\000\002\004\004\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\003\000\002\006\005\000\002" +
    "\006\003\000\002\007\005\000\002\007\003\000\002\007" +
    "\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\014\003\015\012\012\014\014\015\013\016" +
    "\016\001\002\000\022\002\ufff5\004\ufff5\005\ufff5\006\ufff5" +
    "\007\ufff5\010\ufff5\011\ufff5\013\ufff5\001\002\000\022\002" +
    "\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\032\011\ufff7" +
    "\013\ufff7\001\002\000\020\002\ufffc\004\ufffc\005\ufffc\006" +
    "\026\007\030\011\027\013\ufffc\001\002\000\012\002\uffff" +
    "\004\023\005\024\013\uffff\001\002\000\004\002\000\001" +
    "\002\000\004\002\022\001\002\000\014\003\015\012\012" +
    "\014\014\015\013\016\016\001\002\000\022\002\ufff3\004" +
    "\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\013\ufff3" +
    "\001\002\000\022\002\ufff1\004\ufff1\005\ufff1\006\ufff1\007" +
    "\ufff1\010\ufff1\011\ufff1\013\ufff1\001\002\000\004\014\017" +
    "\001\002\000\022\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007" +
    "\ufff2\010\ufff2\011\ufff2\013\ufff2\001\002\000\012\002\ufffb" +
    "\004\ufffb\005\ufffb\013\ufffb\001\002\000\004\013\021\001" +
    "\002\000\022\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\011\ufff4\013\ufff4\001\002\000\004\002\001\001" +
    "\002\000\012\012\012\014\014\015\013\016\016\001\002" +
    "\000\012\012\012\014\014\015\013\016\016\001\002\000" +
    "\020\002\ufffd\004\ufffd\005\ufffd\006\026\007\030\011\027" +
    "\013\ufffd\001\002\000\012\012\012\014\014\015\013\016" +
    "\016\001\002\000\012\012\012\014\014\015\013\016\016" +
    "\001\002\000\012\012\012\014\014\015\013\016\016\001" +
    "\002\000\022\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\010\032\011\ufff9\013\ufff9\001\002\000\012\012\012\014" +
    "\014\015\013\016\016\001\002\000\022\002\ufff6\004\ufff6" +
    "\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\013\ufff6\001" +
    "\002\000\022\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8" +
    "\010\032\011\ufff8\013\ufff8\001\002\000\022\002\ufffa\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\010\032\011\ufffa\013\ufffa" +
    "\001\002\000\020\002\ufffe\004\ufffe\005\ufffe\006\026\007" +
    "\030\011\027\013\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\016\002\010\003\007\004\006\005\005\006" +
    "\004\007\003\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\003\017\004\006\005\005\006\004" +
    "\007\003\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\005" +
    "\035\006\004\007\003\001\001\000\010\005\024\006\004" +
    "\007\003\001\001\000\002\001\001\000\006\006\034\007" +
    "\003\001\001\000\006\006\033\007\003\001\001\000\006" +
    "\006\030\007\003\001\001\000\002\001\001\000\004\007" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ASintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ASintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ASintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<TError> erroresSintacticos = new LinkedList<TError>();
    public String resultado ="";

    public void syntax_error(Symbol s){
        System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
        try {
            TError esR = new TError(s.value.toString(), s.left + 1, s.right + 1, "Error Sintactico Recuperable", "error");
            erroresSintacticos.add(esR);
        } catch (Exception ex) {
            TError esR = new TError("null", s.left + 1, s.right + 1, "Error Sintactico Recuperable", "error");
            erroresSintacticos.add(esR);
        }
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
        try {
            TError esNR = new TError(s.value.toString(), s.left + 1, s.right + 1, "Error Sintactico No Recuperable", "error");
            erroresSintacticos.add(esNR);
        } catch (Exception ex) { 
            TError esNR = new TError("null", s.left + 1, s.right + 1, "Error Sintactico No Recuperable", "error");
            erroresSintacticos.add(esNR);
        }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ASintactico$actions {


        String suma(Object operando1, Object operando2){

        if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")   
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
           TError esNR = new TError(operando1.toString() +"+"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
           erroresSintacticos.add(esNR);
           return "error";
        }
        
        int resultado= Integer.valueOf(operando1.toString())+Integer.valueOf(operando2.toString());
        System.out.println(operando1 + " + " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    }

    String resta(Object operando1, Object operando2){

        if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")  
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
           TError esNR = new TError(operando1.toString() +"-"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
            erroresSintacticos.add(esNR);           
            return "error";
        }
        int resultado= Integer.valueOf(operando1.toString())-Integer.valueOf(operando2.toString());
        System.out.println(operando1 + " - " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    }

    String multiplicacion(Object operando1, Object operando2){
    
       if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")  
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
           TError esNR = new TError(operando1.toString() +"*"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
           erroresSintacticos.add(esNR);
           return "error";
        }

        int resultado= Integer.valueOf(operando1.toString())*Integer.valueOf(operando2.toString());
        System.out.println(operando1 + " * " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    } 
    String division(Object operando1, Object operando2){

        if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")  
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
            TError esNR = new TError(operando1.toString() +"/"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
            erroresSintacticos.add(esNR);
           return "error";
        }
        if(operando2.equals("0")){
           TError esNR = new TError(operando1.toString() +"/"+ operando2.toString(),0,0, "Error Semantico", "no es posible una division en 0");
           erroresSintacticos.add(esNR);
           return "error";
        }



        int resultado= Integer.valueOf(operando1.toString())/Integer.valueOf(operando2.toString());
        System.out.println(operando1 + " / " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    } 
    String potencia(Object operando1, Object operando2){

        if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")  
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
           TError esNR = new TError(operando1.toString() +"^"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
           erroresSintacticos.add(esNR);
           return "error";
        }

       

        int resultado = (int)Math.pow(Integer.valueOf(operando1.toString()) , Integer.valueOf(operando2.toString()));
        System.out.println(operando1 + " * " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    } 
    String modulo(Object operando1, Object operando2){

        if(operando1.equals("false") || operando2.equals("false")   //preguntar si son boolenaos
        || operando1.equals("true")  || operando2.equals("true")  
        || operando2.equals("error") || operando1.equals("error")  //preguntar si son errores
        ){
            TError esNR = new TError(operando1.toString() +"%"+ operando2.toString(),0,0, "Error Semantico", "tipos no compatibles");
            erroresSintacticos.add(esNR);
           return "error";
        }

       int resultado= Integer.valueOf(operando1.toString())%Integer.valueOf(operando2.toString());
        System.out.println(operando1 + " & " + operando2 + " = " + resultado);
        return String.valueOf(resultado);
    } 

  private final ASintactico parser;

  /** Constructor */
  CUP$ASintactico$actions(ASintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ASintactico$do_action_part00000000(
    int                        CUP$ASintactico$act_num,
    java_cup.runtime.lr_parser CUP$ASintactico$parser,
    java.util.Stack            CUP$ASintactico$stack,
    int                        CUP$ASintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ASintactico$result;

      /* select the action based on the action number */
      switch (CUP$ASintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).value;
		RESULT = start_val;
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ASintactico$parser.done_parsing();
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= OPERACION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		
        System.out.println("***   El resultado de la operacion es "+ a+"   ***");
        resultado=a.toString();
        RESULT = a;
    
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // OPERACION ::= A 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = a;                   
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("OPERACION",1, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= A mas B 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = suma(a,b);           
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= A menos B 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = resta(a,b);          
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= B 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = a;                   
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // A ::= error numero 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = a;                   
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // B ::= B por C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = multiplicacion(a,b); 
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // B ::= B dividido C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = division(a,b);       
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // B ::= B mod C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = modulo(a,b);         
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // B ::= C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = a;                   
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // C ::= C pow D 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = potencia(a,b);       
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // C ::= D 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		  RESULT = a;                   
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // D ::= abrir_par OPERACION cerrar_par 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-1)).value;
		 RESULT = a;    
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.elementAt(CUP$ASintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // D ::= rtrue 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		 RESULT = a;    
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // D ::= rfalse 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		 RESULT = a;    
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // D ::= numero 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ASintactico$stack.peek()).value;
		 RESULT = a;    
              CUP$ASintactico$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintactico$stack.peek()), RESULT);
            }
          return CUP$ASintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ASintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ASintactico$do_action(
    int                        CUP$ASintactico$act_num,
    java_cup.runtime.lr_parser CUP$ASintactico$parser,
    java.util.Stack            CUP$ASintactico$stack,
    int                        CUP$ASintactico$top)
    throws java.lang.Exception
    {
              return CUP$ASintactico$do_action_part00000000(
                               CUP$ASintactico$act_num,
                               CUP$ASintactico$parser,
                               CUP$ASintactico$stack,
                               CUP$ASintactico$top);
    }
}

}
