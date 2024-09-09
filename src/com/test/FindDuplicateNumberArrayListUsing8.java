package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumberArrayListUsing8 {
    public static void main(String [] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50,10,20);
        Set<Integer> uniNumber = new HashSet<>();
        List<Integer> duplicateNumber = list.stream().filter(number-> !uniNumber.add(number)).collect(Collectors.toList());
        System.out.println(duplicateNumber);

    }

}
