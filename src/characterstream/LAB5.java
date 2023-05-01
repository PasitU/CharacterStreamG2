package characterstream;

import java.util.Scanner;


public class LAB5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println("enter your weight: ");
        double weight = scan.nextDouble();
        System.out.println("enter your height: ");
        double height = scan.nextDouble();
        System.out.println("Your weight times height = " + weight*height);
    }
}
