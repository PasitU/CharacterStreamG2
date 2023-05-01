package characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter a = new FileWriter("data.txt");
            a.write("Hello World!\nThis is Java.io.Filewriter");
            a.flush();
            a.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int ch;
            FileReader inp = new FileReader("data.txt");
            while((ch = inp.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
