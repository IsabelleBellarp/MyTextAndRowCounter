package MångaÖvningarJava;

import java.util.Scanner;

public class Övning7 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("liter? ");
            Double liter = scan.nextDouble();

            System.out.println("pris? ");
            Double pris = scan.nextDouble();

            System.out.println("rabatt i procent? ");
            Double rabatt = scan.nextDouble();

            Double rabattIProcent = (100 - rabatt) / 100;

            double kostnad = (liter * pris) * rabattIProcent;
            System.out.println("Kostnad: " + kostnad);
        }
    }

