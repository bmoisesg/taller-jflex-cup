package Generador;
import java.io.File;


public class GenLex {
    public static void main(String[] args) {
        String pathhtml="C:/Users/Julissa/Desktop/TallerIntermedias/taller-jflex-cup/Taller_Analizador/src/Analizadores/Lexico.jflex";
        GenerarLexicoHtml(pathhtml);
    }
    public static void GenerarLexicoHtml(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
}
