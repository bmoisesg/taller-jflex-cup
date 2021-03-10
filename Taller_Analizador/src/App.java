import java.io.BufferedReader;
import java.io.StringReader;

import Analizadores.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            String texto = "1+2*2/3-5/4*5*8/9*9-9-1^8%2";
            ALexico scan = new ALexico(new BufferedReader(new StringReader(texto)));
            Parser parser = new Parser(scan);
            parser.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
