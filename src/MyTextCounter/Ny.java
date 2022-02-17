package MyTextCounter;

import java.util.Scanner;

public class Ny {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();



        switch (character) {

            case "Homer":
                System.out.println("D'oh!");
                break;
            case "Marge":
                System.out.println("Mmm-mmmm");
                break;
            case "Bart":
                System.out.println("Ay caramba!");
                break;
            case "Lisa":
                System.out.println("If anyone wants me, I'll be in my room");
                break;
            case "Maggie":
                System.out.print("(Pacifier Suck");
                break;
            case "Ned":
                System.out.println("Hi-Diddily-Ho!");
                break;
            case "Burns":
                System.out.println("Excellent");
                break;
            case "Edna":
                System.out.println("Ha!");
                break;
            case"Chalmers":
                System.out.println("SEEEEEEYAAAAAMOOOOUURR!");
                break;
            case"Apu":
                System.out.println("Thank you come again!");
                break;
            case"Stu":
                System.out.print("Stu likes disco music!");
                break;
            default: System.out.println("No Simpsons charachter!");
            break;

        }


    }
}
