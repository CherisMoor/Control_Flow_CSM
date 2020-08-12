package ContFlowProject;

import java.util.Scanner;

public class AsciiChars {
    
    public static void printNumbers() {
        // TODO: print valid numeric input
        // print the valid characters for input
        int i = 30;

        while(i <= 39){
            System.out.println("The ASCII Value of " + (char)i + " = " + i); i++;
        }
        AsciiChars.printNumbers();
    }

    public static void printLowerCase() {
        // TODO: print valid lowercase alphabetic input
        // print the valid characters for input
        AsciiChars.printLowerCase();
    }

    public static void printUpperCase() {
        // TODO: print valid uppercase alphabetic input
        // print the valid characters for input
        AsciiChars.printUpperCase();
    }


    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a string: ");     // type a word and hit enter

    String someString = userInput.next();
}