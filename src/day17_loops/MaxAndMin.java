package day17_loops;


import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.


    2
    Ask a user:
    Tell if it is biggest or smallest.

    3
    Ask a user:
    Tell if it is biggest or smallest.
    ---------------------------------
    public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);

        System.out.println("How many numbers do you want to compare? ");
        int numOfCycle = key.nextInt(); // asks the user to input how many numbers they want to compare

        int n = 1; // counter for the loop
        int userNum; // variable to store each user input
        String allNums = ""; // a string to store all the numbers entered by the user

        // Initialize max and min with extreme values
        int max = -2_147_483_647; // initializes the maximum value with the smallest possible integer
        int min = 2_147_483_647; // initializes the minimum value with the largest possible integer

        // Loop to get input from the user
        while (n <= numOfCycle) {
            System.out.println("Please enter a number: ");
            userNum = key.nextInt(); // prompts the user to input a number

            allNums += " " + userNum; // appends the entered number to the string containing all numbers

            // check if the entered number is greater than the current max
            if (userNum > max){
                max = userNum; // updates max if the entered number is greater
            }

            // check if the entered number is smaller than the current min
            if (userNum < min) {
                min  = userNum; // updates min if the entered number is smaller
            }

            n++; // increment the loop counter
        }

        // Print the minimum and maximum numbers
        System.out.println("Smallest number entered: " + min); // prints the smallest number entered
        System.out.println("Largest number entered: " + max); // prints the largest number entered
        System.out.println("All the numbers from the user: " + allNums); // prints all numbers entered by the user
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);

        System.out.println("How many numbers you want to compare: ");
        int numOfCycle = key.nextInt();

        int n = 1;
        int userNum;
        String allNums = "";

        // -2,147,483,647 to 2,147,483,647
        int max = -2_147_483_647;
        int min = 2_147_483_647;


        while (n <= numOfCycle) {
            System.out.println("Please, enter a number: ");
            userNum = key.nextInt(); // 78 | 100 | 45 | -34 | 21

            allNums += " " + userNum;
            if (userNum > max){
                max = userNum;   // max = 78; 100
            }

            if (userNum < min) {
                min  = userNum;  // min = 78;  45; -34
            }

            n++;
        }

        System.out.println(min); // -34
        System.out.println(max); // 100
        System.out.println("All the numbers from user: " + allNums);

    }
}