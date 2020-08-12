package ContFlowProject;

import java.util.*;

public class Main {

    static void AsciiCharsPrintNumbers() {
        int i = 48;

        while (i <= 57) {
            System.out.println("The ASCII Value of " + (char) i + " = " + i);
            i++;
        }
    }

    static void AsciiCharsPrintLowerCase() {
        int i = 97;

        while (i <= 122) {
            System.out.println("The ASCII Value of " + (char) i + " = " + i);
            i++;
        }
    }

    static void AsciiCharsPrintUpperCase() {
        int i = 65;

        while (i <= 90) {
            System.out.println("The ASCII Value of " + (char) i + " = " + i);
            i++;
        }
    }

    public void Survey() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String userName = userInput.next();
        System.out.println("Hello, " + userName);

        System.out.println("Would you like to continue this survey " + userName + "?");

        String yesNo = userInput.next();

        if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {

            Questions.magicBall();

        } else {
            System.out.println("Please come back to continue survey later");
        }
        // Questions.magicBall();
    }

    // Main magic = new Main();

    public static void main(String[] args) {
        AsciiCharsPrintNumbers();
        AsciiCharsPrintLowerCase();
        AsciiCharsPrintUpperCase();
        // Above Calls the static methods from Classes

        Main Questions = new Main(); // Create an object of Main
        Questions.Survey(); // Call the public method on the object

        // Questions.magicBall();
    }
}
