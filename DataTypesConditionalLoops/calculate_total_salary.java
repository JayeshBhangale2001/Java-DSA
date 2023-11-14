package DataTypesConditionalLoops;

import java.util.Scanner;

public class calculate_total_salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Basic Salary and Grade on a single line
        double basicSalary = scanner.nextDouble();
        char grade = scanner.next().charAt(0);

        // Constants for percentage and allowances
        double hraPercentage = 0.20;
        double daPercentage = 0.50;
        double pfPercentage = 0.11;
        double allow;

        // Calculations
        double hra = hraPercentage * basicSalary;
        double da = daPercentage * basicSalary;
        double pf = pfPercentage * basicSalary;

        // Determine allowance based on grade
        switch (grade) {
            case 'A':
                allow = 1700.0;
                break;
            case 'B':
                allow = 1500.0;
                break;
            default:
                allow = 1300.0;
                break;
        }

        // Calculate total salary
        double totalSalary = basicSalary + hra + da + allow - pf;

        // Output: Total Salary
        System.out.println(Math.round(totalSalary));
    }
}
