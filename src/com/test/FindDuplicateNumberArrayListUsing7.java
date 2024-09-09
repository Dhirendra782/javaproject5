package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumberArrayListUsing7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,10,20);
        Set<Integer> uniNumber = new HashSet<>();
        for(Integer number: list) {
            if(!uniNumber.add(number)) {
                System.out.println(number);
            }

        }

    }

}
