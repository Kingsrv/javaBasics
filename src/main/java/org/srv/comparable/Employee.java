package org.srv.comparable;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{

    List<Integer> abc = new ArrayList<>();
    private int age;
    private String name;
    private double salary;
    private String address;

    public Employee(int age, String name, double salary, String address) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;
    }
//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
