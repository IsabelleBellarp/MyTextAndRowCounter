package MångaÖvningarJava;

import java.util.Scanner;

public class Övning9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in cirkeln radie: ");
        int r = scan.nextInt();

        int d = 2 * r;
        int potent = r * r;
        double A = 3.14 * potent;
        double O = 3.14 * d;

        System.out.println("Arean: " + (Math.round(A)));
        System.out.println("Omkretsen: " + (Math.round(O)));

        System.out.print("hej");

    }
}
