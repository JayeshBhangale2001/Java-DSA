import java.math.BigInteger;
import java.util.Scanner;

public class multiply2numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for large integers
        // System.out.print("Enter the first large integer: ");
        BigInteger F1 = scanner.nextBigInteger();

        // System.out.print("Enter the second large integer: ");
        BigInteger F2 = scanner.nextBigInteger();

        // Calculate and print the product
        BigInteger result = F1.multiply(F2);
        System.out.println(result);

        // Close the Scanner to release resources (optional, but good practice)
        scanner.close();
    }
}
