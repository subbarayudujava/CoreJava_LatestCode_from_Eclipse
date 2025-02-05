package com.nt;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Reverse the array
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("\nReversed Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
