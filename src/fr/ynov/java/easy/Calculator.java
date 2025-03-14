package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter only two numbers");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);
            scanner.close();

            double result = switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> (num2 != 0) ? num1 / num2 : Double.NaN;
                default -> Double.NaN;
            };
            if (!Double.isNaN(result)) {
                System.out.println("Result" + result);
            } else {
                System.out.println("Invalid operator or operation");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure both arguments are valid numbers");
        }
    }
}


