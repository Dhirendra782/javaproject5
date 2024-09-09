package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortValueBaseUsing8 {

    public static void main(String [] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("c",3);
        map.put("a",2);
        map.put("b",1);
        map.put("d",4);
        map.put("e",5);
        System.out.println("Before Sort Map");
        System.out.println(map);

       LinkedHashMap<String,Integer> sortedMap = map.entrySet().stream().sorted((e1,e2)-> {
           return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));
        System.out.println("After Sorting Map ");
        System.out.println(sortedMap);
    }

}
