/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB3 {

    public static void main(String[] args) {
        try {
            PrintWriter a = new PrintWriter("data3.txt");
            a.println("Harry Potter");
            a.println(19);
            a.println(60.5);
            a.println((double) 175.0);
            a.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader file = new FileReader("data3.txt");
            Scanner scan = new Scanner(file);
            String a = scan.nextLine();
            int b = scan.nextInt();
            double c = scan.nextDouble();
            double d = scan.nextDouble();
            System.out.println(a + " " + b + " " + c + " " + d);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
