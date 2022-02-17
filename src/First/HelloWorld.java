package First;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        SignChecker checker = new SignChecker();

        boolean myTrueString = checker.isLongString("hej jag heter Isabellé");

        System.out.println(myTrueString);
    }

}

// Värdet som jag skickar in
//boolean myTrue = checker.isTrue(7);

// System.out.println(myTrue);