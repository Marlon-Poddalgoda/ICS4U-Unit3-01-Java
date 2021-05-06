import java.util.Scanner;
/**
 * This program reverses an inputted string using recursion.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-06
 */

public final class Recursion {
    private Recursion() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method reverses a string using recursion.
    * @param userString This value is the user inputted string.
    * @return someString This value returns the reversed string.
    */
    public static String reverse(final String userString) {
        // uses recursion to reverse a string

        int length = userString.length();

        // if statement
        if (length == 0) {
            return userString;
        } else {
            // reverses string
            // uses substring() to assign first letter to back of string
            return reverse(userString.substring(1)) + userString.charAt(0);
        }
    }


    /**
    * This method takes in user input and passes to the function.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner userInput = new Scanner(System.in);

        // program information
        System.out.println("This program reverses an inputted string"
            + " using recursion.");
        System.out.println();

        // Asks user to enter a string
        System.out.print("Enter a string: ");

        String stringInput = userInput.nextLine();

        // call recursive function
        String reversedString = reverse(stringInput);

        // print original string to console
        System.out.println("");
        System.out.println("The original string is : " + stringInput);
        // print reversed string to console
        System.out.println("");
        System.out.println("The reversed string is : " + reversedString);

        System.out.println("");
        System.out.println("Done.");
    }
}
