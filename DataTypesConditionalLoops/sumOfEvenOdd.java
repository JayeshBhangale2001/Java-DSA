package DataTypesConditionalLoops;

import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the integer 'n'
        // System.out.print("Enter an integer 'n': ");
        int n = scanner.nextInt();

        // Calculate the sum of even and odd digits
        int sumEven = 0;
        int sumOdd = 0;

        while (n > 0) {
            int digit = n % 10; // Extract the last digit

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            n /= 10; // Remove the last digit
        }

        // Output: Print the sum of even and odd digits
        System.out.println(sumEven + " " + sumOdd);
    }
}
