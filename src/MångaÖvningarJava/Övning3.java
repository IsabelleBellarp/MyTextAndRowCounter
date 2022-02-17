package MångaÖvningarJava;

import java.util.Scanner;

public class Övning3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in antal timmar:");

        int timme = scan.nextInt();
        int minuter = timme * 60;
        int sekunder = minuter * 60;

        System.out.println("Minuter:" + minuter);
        System.out.println("Sekunder:" + sekunder);


    }
}
