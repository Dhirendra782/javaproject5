package com.test;

public class FindPalindromeWordsFromSentence7 {
    public static void main(String[] args) {
        String input = "My name is nitin and I can speak malayalam";
        String words[] = input.split(" ");
        for (String word: words) {
            if(isPalindrome(word)) {
                System.out.println(word+": is palindrome");
            }
        }
    }

    public static boolean isPalindrome(String input) {
        int i = 0;
        int len = input.length() - 1;
        while (len > i) {
            if (input.charAt(i) != input.charAt(len)) {
                return false;
            }
            i++;
            len--;
        }
        return true;
    }

}











