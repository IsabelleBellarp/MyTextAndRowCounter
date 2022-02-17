package MångaÖvningarJava;

import java.util.Scanner;

public class Övning4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in första talet:");
        int first = scan.nextInt();

        System.out.println("Skriv in andra talet:");
        int seconde = scan.nextInt();

        System.out.println("Skriv in tredje talet:");
        int third = scan.nextInt();

        int total = first+seconde+third;

        System.out.println("Summa:" + total);
        System.out.println("Medelvärde:" + total/3);
    }
}
