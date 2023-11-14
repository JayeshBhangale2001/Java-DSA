package DataTypesConditionalLoops;

import java.util.Scanner;

public class printing_Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        // System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Output: Print factors excluding 1 and the number itself
        // System.out.print("Factors of " + number + " (excluding 1 and the number
        // itself): ");

        int countFactors = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                countFactors++;
            }
        }

        // Check if the number has only two factors
        if (countFactors == 0 && number != 1) {
            System.out.print("-1");
        }
    }
}
