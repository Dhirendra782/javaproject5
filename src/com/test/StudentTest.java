package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();

        student.add(new Student(1,"Dhiru",70));
        student.add(new Student(2,"Birendra",75));
        student.add(new Student(3,"Manish",78));
        student.add(new Student(4,"Rinku",85));
        student.add(new Student(5,"Ilyas",90));

        List<String> marks = student.stream()
                .filter(mark-> mark.getMarks()>75)
                .map(name->name.getName()+ " "+name.getMarks())
                .collect(Collectors.toList());
        
        System.out.println(marks);

    }

}
