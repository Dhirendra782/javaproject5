package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest1FroupByCityName {

    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1,"Mumbai","Maharashtra");
        Employee1 e2 = new Employee1(2,"Mumbai","Maharashtra");
        Employee1 e3 = new Employee1(3,"Patna","Bihar");
        Employee1 e4 = new Employee1(4,"Patna","Madhubani Bihar");

        List<Employee1> list = Arrays.asList(e1,e2,e3,e4);
       Map<String, List<Employee1>> groupByCity = list.stream().collect(Collectors.groupingBy(Employee1::getCity));
        System.out.println(groupByCity);

    }

}
