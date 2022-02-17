package MångaÖvningarJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Övning2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vad har du sålt för denna månaden?:");

        int grundlön = 8000;
        int försäljning = scan.nextInt();
        double proc = 0.09;
        DecimalFormat format = new DecimalFormat("0.#");

        System.out.println("Din lön blir:" + format.format(grundlön + försäljning * proc));


    }
}
