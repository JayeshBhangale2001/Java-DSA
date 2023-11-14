package DataTypesConditionalLoops;

import java.util.Scanner;

public class multiple_of_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        long take_input = s.nextLong();

        if (take_input >= 5 && take_input % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a Multiple of 5");
        }

        // Close the Scanner to release resources (optional, but good practice)
        s.close();
    }
}
