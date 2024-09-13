package com.test;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        String rev ="";

        for(int i=st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }

        System.out.println("Reverse of String is : "+rev);
    }

}
