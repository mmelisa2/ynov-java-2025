package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}
