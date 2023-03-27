package org.srv.comparator;

import org.srv.comparable.Employee;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}
