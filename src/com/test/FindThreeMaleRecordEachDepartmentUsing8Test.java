package com.test;

import java.util.*;
import java.util.stream.Collectors;

//Find top 3 male employee by salary having age between 30 and 40 in each department
public class FindThreeMaleRecordEachDepartmentUsing8Test {

    public static void main(String [] args) {

        List<Employee2> list = Arrays.asList(
                new Employee2(32,"Dhiru","Male","IT",20000),
                new Employee2(32,"Dhirendra","Male","IT",21000),
                new Employee2(34,"Rahul","Male","IT",22000),
                new Employee2(35,"Sunil","Male","IT",22000),

                new Employee2(31,"Birendra","Male","HR",25000),
                new Employee2(32,"Birendra1","Male","HR",25000),
                new Employee2(33,"Birendra2","Male","HR",25000),

                new Employee2(34,"Manish","Male","finance",30000),
                new Employee2(34,"Manish1","Male","finance",30000),
                new Employee2(34,"Manish2","Male","finance",30000),

                new Employee2(40,"Pooja","Female","Non IT",35000),
                new Employee2(39,"Pooja1","Female","Non IT",35000),
                new Employee2(39,"Pooja1","Female","Non IT",35000),

                new Employee2(37,"Juhee","Female","HR MBA",35000),
                new Employee2(38,"Santosh","Male","HR MBA",36000));

        Map<String, List<Employee2>> employeeByDepartment = list.stream()
                .filter(e-> e.getGender().equalsIgnoreCase("Male"))
                .filter(e->e.getAge()>=30 && e.getAge()<=40)
                .collect(Collectors.groupingBy(Employee2::getDepartment));

        Map<String,List<Employee2>> topMaleEmployeeDepartment = new HashMap<>();

        employeeByDepartment.forEach((department, employeeList)-> {
            List<Employee2> top3Employee = employeeList.stream().sorted(Comparator.comparingDouble(Employee2::getSalary).reversed())
                    .limit(3)
                    .collect(Collectors.toList());
            topMaleEmployeeDepartment.put(department,top3Employee);
        });

        topMaleEmployeeDepartment.forEach((department, topEmployee)->{
            System.out.println("Department "+department);
            topEmployee.forEach(System.out::println);
        });


    }

}




















