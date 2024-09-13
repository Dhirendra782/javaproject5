package com.test;

public class FindTheLengthOfLastWordString7 {

    public static void main(String[] args) {

        String s ="welcome to cloudtech";
        s = s.trim();
        int len =0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) ==' ') {
                break;
            }
            else {
                len++;
            }
        }

        System.out.println("Length of the last word is: "+len);
    }

}
