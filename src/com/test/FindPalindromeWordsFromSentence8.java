package com.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindPalindromeWordsFromSentence8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split the sentence into words and process using Streams
        String palindromes = Arrays.stream(sentence.split(" "))
                .filter(isPalindrome()).collect(Collectors.joining(", "));

        // Output the palindrome words
        if (!palindromes.isEmpty()) {
            System.out.println("Palindrome words: " + palindromes);
        } else {
            System.out.println("No palindrome words found.");
        }

        scanner.close();
    }

    // Method to return a Predicate for checking palindromes
    private static Predicate<String> isPalindrome() {
        return word -> {
            // Remove non-alphanumeric characters and convert to lowercase
            String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = cleanedWord.length() - 1;

            while (left < right) {
                if (cleanedWord.charAt(left) != cleanedWord.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        };
    }
}

