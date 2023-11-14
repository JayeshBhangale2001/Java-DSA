package DataTypesConditionalLoops;

import java.util.Scanner;

public class powerOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the values of x and n
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        // Calculate x^n
        long result = power(x, n);

        // Output: Print the result
        System.out.println(result);
    }

    // Recursive method to calculate x^n
    private static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
