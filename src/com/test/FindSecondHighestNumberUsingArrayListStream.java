package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class FindSecondHighestNumberUsingArrayListStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9);
        Optional<Integer> secondHighestNumber = list.stream()
                .distinct().sorted((a,b)-> b-a).skip(1).findFirst();
            System.out.println("Second Highest Number is: "+secondHighestNumber);

    }

}





















