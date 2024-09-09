package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Squire even number arraylist using stream 8
public class SquireEvenNumberUsingArrayListStream8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> squireEvenNumber = list.stream().map(number->number * number)
                .filter(number-> number%2 == 0).collect(Collectors.toList());
               System.out.println(squireEvenNumber);

    }

}
