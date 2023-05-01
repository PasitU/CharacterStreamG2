
package characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB2 {
    public static void main(String[] args) {
        try {
            BufferedWriter writerBuffered = new BufferedWriter(new FileWriter("data2.txt"));
            writerBuffered.write("Hello World!\nBuffered Writer");
            writerBuffered.flush();
            writerBuffered.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BufferedReader readerBuffered = new BufferedReader(new FileReader("data2.txt"));
            String ch;
            while((ch = readerBuffered.readLine(
            )) != null){
                System.out.println(ch);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
