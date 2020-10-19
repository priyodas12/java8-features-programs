package io.javalab1.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

//multiple sorting criteria
public class ListOfEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add( new Employee(2, "abc") );
        list.add( new Employee(1, "abc") );
        list.add( new Employee(4, "cad") );
        list.add( new Employee(5, "abc") );
        list.add( new Employee(3, "cad") );
        list.add( new Employee(7, "cad") );
        list.add( new Employee(6, "ved") );

        list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("---------------------------");

        list.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))).collect(Collectors.toList()).forEach(System.out::println);

        //Collections.sort(list,Comparator.comparing(Employee::getName).thenComparing(Employee::getId));

        //System.out.println(list);
    }
}
