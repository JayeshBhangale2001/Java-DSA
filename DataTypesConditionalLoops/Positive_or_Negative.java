package DataTypesConditionalLoops;

import java.util.*;

public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int take_input = s.nextInt();
        if (take_input < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}