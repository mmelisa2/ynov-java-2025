package fr.ynov.java.easy;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;

        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println("Using standard for loop");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
        System.out.println("Using for-each loop");
        for (int number : numbers2) {
            System.out.println(number);
        }
    }
}
