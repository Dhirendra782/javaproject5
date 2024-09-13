package com.test;

public class RotateElementArrayLeftByNTime {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int n = 3;

        // Ensure n is within the array bounds
        n = n % arr.length;

        // Create a new array to hold the rotated values
        int[] rotatedArr = new int[arr.length];

        // Copy the elements into the new rotated array
        for (int i = 0; i < arr.length; i++) {
            int newPos = (i + arr.length - n) % arr.length;
            rotatedArr[newPos] = arr[i];
        }

        // Print the rotated array
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}












