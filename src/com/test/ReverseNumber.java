package com.test;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int rev = 0;
        while(number !=0) {
            int rem = number % 10;
            rev = rev * 10 +rem;
            number = number / 10;
        }
        System.out.println("Reverse number is: "+rev);
    }

}
