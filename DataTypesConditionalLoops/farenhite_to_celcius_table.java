package DataTypesConditionalLoops;

import java.util.Scanner;

public class farenhite_to_celcius_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int startFahrenheit = scanner.nextInt();
        int endFahrenheit = scanner.nextInt();
        int stepSize = scanner.nextInt();

        // Print table header
        // System.out.println("Fahrenheit Celsius");

        // Iterate through the Fahrenheit values and convert to Celsius
        for (int fahrenheit = startFahrenheit; fahrenheit <= endFahrenheit; fahrenheit += stepSize) {
            // Convert Fahrenheit to Celsius
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));

            // Print the table row
            System.out.println(fahrenheit + " " + celsius);
        }
    }
}
