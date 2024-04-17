package day09_a_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Are you employed?  [true/false] ");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Are you a student? [true/false] ");
        boolean isStudent =  input.nextBoolean();

        String personalInfo = firstName + " " + lastName + " " + "information: \n\tIs employed: "+ "\n\tIs a student: "+ isStudent;

        System.out.println(personalInfo);
    }
}
