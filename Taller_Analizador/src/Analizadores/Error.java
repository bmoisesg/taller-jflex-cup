package Analizadores;

public class Error {
    String lexema, tipo, descripcion;
    int linea, columna;

    public Error(String lex, int lin, int col, String tipo, String desc){
        this.lexema=lex;
        this.linea=lin;
        this.columna=col;
        this.tipo= tipo;
        this.descripcion=desc;
    }
}
