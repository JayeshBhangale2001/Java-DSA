package DataTypesConditionalLoops;

import java.util.Scanner;

public class find_character_case {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        char input1 = s.next().charAt(0);

        if (Character.isUpperCase(input1)) {
            System.out.println("1");
        } else if (Character.isLowerCase(input1)) {
            System.out.println("0");
        } else if (!Character.isLetter(input1)) {
            System.out.println("-1");
        }
    }
}
