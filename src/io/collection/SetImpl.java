package io.collection;

import java.util.*;

public class SetImpl {
    public static void main(String[] args) {
        Set<Employee> employeeSet=new TreeSet<>(Comparator.comparing(Employee::getId).thenComparing(Employee::getName));
        employeeSet.add(new Employee(4,"abc"));
        employeeSet.add(new Employee(2,"bcd"));
        employeeSet.add(new Employee(1,"abc"));
        employeeSet.add(new Employee(1,"aba"));
        employeeSet.forEach(employee -> System.out.println(employee));
    }
}
