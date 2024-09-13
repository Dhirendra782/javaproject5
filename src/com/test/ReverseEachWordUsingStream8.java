package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordUsingStream8 {

    public static void main(String [] args) {
        String input ="my name is dhiru";
        String words[] = input.split(" ");

       String reverseWord = Stream.of(words).map(word-> new StringBuilder(word)
                .reverse().toString())
                .collect(Collectors.joining(" "));
       System.out.println(reverseWord);


    }

}
