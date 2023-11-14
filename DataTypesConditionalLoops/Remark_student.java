package DataTypesConditionalLoops;

import java.util.*;

public class Remark_student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input1 = s.nextInt();

        if (input1 >= 35 && input1 <= 50) {
            System.out.println("Below Average");
        } else if (input1 > 50 && input1 <= 75) {
            System.out.println("Average");
        } else {
            System.out.println("Distinction");
        }
    }
}
