package com.test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the phone number in single list using stream
public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Dhiru", Arrays.asList("996799781","8825352201"));
        Person person2 = new Person("Dhiru", Arrays.asList("7485854940","7485854941"));
        Person person3 = new Person("Dhiru", Arrays.asList("7485854942","7485854944"));
        Person person4 = new Person("Dhiru", Arrays.asList("7485854945","7485854946"));

        List<Person> list = Arrays.asList(person1,person2,person3,person4);
       List<String> phoneNumberList = list.stream().flatMap(number-> number.getPhoneNumber().stream())
                .collect(Collectors.toList());
       System.out.println(phoneNumberList);

    }

}
