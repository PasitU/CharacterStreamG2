package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {

    public static void main(String[] args) {
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader inp = new BufferedReader(key);
            System.out.println("Enter your name: ");
            String str;
            str = inp.readLine();
            System.out.println("Hello " + str);
            System.out.println("Enter your age: ");
            String d = inp.readLine();
            System.out.println("Your age times 2 = " + Double.parseDouble(d)*2);
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
