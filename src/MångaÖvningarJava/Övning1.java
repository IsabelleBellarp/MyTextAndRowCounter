package MångaÖvningarJava;

import java.util.Scanner;

public class Övning1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv en siffra");

        int number1 = scan.nextInt();


        System.out.println("Kvadraten är:" + number1 * number1);

    }
}
