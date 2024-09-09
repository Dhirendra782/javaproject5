package com.test;

import java.util.Scanner;

public class PalindromString {

    public static void main(String [] args) {
        System.out.println("Enter the String check palindrom");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        String rev ="";

        for(int i = st.length()-1; i>=0; i--) {
            rev = rev + st.charAt(i);
        }

        if(rev.equals(st)) {
            System.out.println("String is palindrom");
        }

        else  {
            System.out.println("String is not palindrom");
        }

    }

}
