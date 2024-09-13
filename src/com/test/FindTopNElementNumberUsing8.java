package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTopNElementNumberUsing8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20,30,40,50,70);

        List<Integer> topNElement = list.stream().sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());
            System.out.println("Top N Element: "+topNElement);

    }


}
