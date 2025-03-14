package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static double square(double number) {
        return number * number;
    }
    public static void main(String[] args) {
        double number;

        if (args.length > 0) {
            try {
                number = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid number");
                return;
            } finally {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number: ");
                number = scanner.nextDouble();
                scanner.close();
            }
            double result = square(number);
            System.out.println("Result: " + result);
        }
    }
}

