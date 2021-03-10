package Generador;

import java.io.File;

public class GenLex {
    public static void main(String[] args) {
        File fichero = new File("src\\Analizadores\\ALexico.java");
        fichero.delete();

        String pathhtml = "src\\Analizadores\\Lexico.jflex";
        GenerarLexicoHtml(pathhtml);
        String pathSintactico = "src\\Analizadores\\";
        GenerarSintactico(pathSintactico);
    }

    public static void GenerarLexicoHtml(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }

    public static void GenerarSintactico(String ruta) {
        try {
            String opcCUP[] = { "-destdir", ruta, "-parser", "Parser", ruta + "Sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
