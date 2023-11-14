package DataTypesConditionalLoops;

import java.util.Scanner;

public class ScopeOfVariable {
    public static void main(String args[]) {

        int i = 1;
        int j = 10;
        while (i <= 5) {
            System.out.println(j);
            i++;
            j++;
        }
        System.out.println(i);
        System.out.println(j);

    }
}