package day09_a_scanner;

//#1 - We need to have the import
import java.util.Scanner;


public class FirstScanner {
    public static void main(String[] args) {

        // #2 - Scanner Object declaration / instantiation
        // Scanner input; --- > input is the object reference name
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a number: ");

        // #3 - We get the value for console
        int userNumber = input.nextInt(); // Return input as int -- > Therefore, I can assign it into int variable
        System.out.println("You entered: " + userNumber);


    }
}