package com.test;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedNumberUing8 {

    public static void main(String[]args) {

        List<Integer> list = Arrays.asList(1,2,3,4,1,2,3);
        Map.Entry<Integer,Long> number = list.stream()
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
             .entrySet().stream().filter(entry-> entry.getValue()==1).findFirst().get();
        System.out.println("First Non Repeated Number is: "+number.getKey());

    }

}














