package MyTextCounter;

import java.util.Locale;
import java.util.Scanner;

public class MyTextCounter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Counter myCounter = new Counter();

        String text = scan.nextLine().toLowerCase();

        while (myCounter.containsStop(text)) {
            myCounter.increaseCharacters(text);
            myCounter.addRow();
            text = scan.nextLine().toLowerCase();
        }

        System.out.println("You wrote " + myCounter.getCharacters() + " characters");
        System.out.println("You wrote " + myCounter.getRows() + " rows");
    }
}
