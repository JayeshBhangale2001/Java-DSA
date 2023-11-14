package DataTypesConditionalLoops;

import java.util.Scanner;

public class multiplication_tableOf_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number for which you want the multiplication table
        // System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print the multiplication table
        // System.out.println("Multiplication Table for " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
