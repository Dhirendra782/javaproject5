package com.test;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1,"DHiru",25,20000),
                new Employee(2,"Birendra",26,25000),
                new Employee(3,"Manish",27, 26000),
                new Employee(4,"Rinku",23, 30000),
                new Employee(5,"Ilyas",24, 35000));
        System.out.println("Before List");
        System.out.println(list);

        List<Employee> incrementSalary = list.stream().map(e-> {
            if(e.getAge()>25) {
                e.setSalary(e.getSalary()* 1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println("After List");
        System.out.println(incrementSalary);
    }

}







