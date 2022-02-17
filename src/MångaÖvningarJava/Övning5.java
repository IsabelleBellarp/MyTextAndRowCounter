package MångaÖvningarJava;

import java.util.Scanner;

public class Övning5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in antal svenska kronor:");

        int SEK = scan.nextInt();
        int USD = SEK * 6;
        int GBP = SEK * 10;

        System.out.println("Dollar:" + USD);
        System.out.println("Pund:" + GBP);


    }
}
