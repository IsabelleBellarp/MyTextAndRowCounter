package MyTextCounter;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fibonacci = Integer.parseInt(scan.nextLine());
        int number = 1;
        int nextNumber = 1;

        for (int i=0;i<(fibonacci-2);i++) {
            System.out.println(number);

            nextNumber += number;
            number = nextNumber - number;
        }

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println();
        System.out.println("The " +fibonacci + ":th fibonacci number is: " + nextNumber);

    }
}
