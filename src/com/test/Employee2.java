package com.test;


//Find top 3 male employee by salary having age between 30 and 40 in each department

public class Employee2 {

    private int age;
    private String name;
    private String gender;
    private String department;
    private double salary;


    public Employee2() {
    }

    public Employee2(int age, String name, String gender, String department, double salary) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
