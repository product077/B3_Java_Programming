package day18_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("What number you want to see in the multiplication table");
        int num = key.nextInt();
        System.out.println(num + " x " + "1" + " = " + num*1);
        for (int i = 1; i <=10; i++) {
            System.out.println(num + " x " +  i + " = " + num*1);
        }
    }
}
