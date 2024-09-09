package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoProgramFlatMap {
    public static void main(String [] args) {

        List<List<String>> list = Arrays.asList(
                                    Arrays.asList("Java","C Programming"),
                                    Arrays.asList("Spring","Spring Boot"),
                                    Arrays.asList("Hibernate","JPA"),
                                    Arrays.asList("MySQL","Pstgrase MYSQL"));

       List<String> skill =  list.stream().flatMap(skillList-> skillList.stream()).collect(Collectors.toList());
        System.out.println(skill);

        //This logic for starting with s skill
        List<String> startWith = skill.stream().filter(startWiths-> startWiths.startsWith("S")).collect(Collectors.toList());

        System.out.println(startWith);
    }

}
