package DataTypesConditionalLoops;

import java.util.Scanner;

public class LargestOfTwo_nested_if_else {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        if (a > b) {
            System.out.println("First number is greater");
        } else if (b > a) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }

    }
}