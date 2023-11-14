package DataTypesConditionalLoops;

import java.util.Scanner;

public class return_keyword {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int div = 2;
        boolean isPrime = true;

        while (div <= n - 1) {
            if (n % div == 0) {

                System.out.println("Composite");

                return;

            }
            div = div + 1;
        }
        System.out.println("Prime");

    }
}