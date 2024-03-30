package day03_comments_escape_sequence;

public class Comments {
    public static void main(String[] args) {
        //#1-This is a SINGLE line comment
        //This line below prints Hello to the console
        System.out.println("Hello");
        System.out.println();
        /*
           this is MULTILINE comment
           I want to
           type multiple line
           as a comment
         */
        System.out.println("A");
        /**
         * #-Java doc comment -> Java documentatio comment
         * The following code is printing a statement
         * that says "This is a println statement"
         *
         */
        System.out.println("This is  println statement");
        //ToDo: Change the weekday when you run this test
        System.out.println("Today is Sunday");
        /*
        ToDo:
         */
    }
}
