package org.srv.comparator;

import org.srv.comparable.Employee;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
