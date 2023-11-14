package DataTypesConditionalLoops;

import java.util.Scanner;

public class print_ascci_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int ascii_value = character; // Cast the character to int to get its ASCII value
        System.out.println(ascii_value);

        // Close the Scanner to release resources (optional, but good practice)
        scanner.close();
    }
}
