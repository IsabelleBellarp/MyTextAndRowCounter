package MångaÖvningarJava;

import java.util.Scanner;

public class Övning8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in längden på rektangelns kortsida:");
        int kort = scan.nextInt();

        System.out.println("Skriv in längden på rektangelns långsida:");
        int långsida = scan.nextInt();

        int O = kort + kort + långsida + långsida;
        int A = kort * långsida;

        System.out.println("Omkretsen: " + O);
        System.out.println("Arean: " + A);
    }
}
