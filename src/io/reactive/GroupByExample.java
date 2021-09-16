package io.reactive;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByExample {
    private static List<Employee> getEmployeeList(){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(101,"A1",1111,"active",250000));
        employeeList.add(new Employee(102,"B1",2222,"inactive",120000));
        employeeList.add(new Employee(103,"C1",3333,"active",50000));
        employeeList.add(new Employee(104,"B2",3333,"inactive",270000));
        employeeList.add(new Employee(105,"A2",2222,"inactive",210000));
        employeeList.add(new Employee(106,"A3",1111,"active",80000));
        employeeList.add(new Employee(107,"C2",2222,"active",240000));
        employeeList.add(new Employee(108,"C3",1111,"active",60000));
        return employeeList;
    }
    public static void main(String[] args) {
        //find out the total active employees
        List<Employee> activeEmployees=getEmployeeList().stream().filter(e->e.getStatus().equalsIgnoreCase("active")).collect(Collectors.toList());
        System.out.println(activeEmployees);
        //find out max salaried employee.
        Optional<Employee> maxSalariedEmp=getEmployeeList().stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println("Max Salaried Employee: "+maxSalariedEmp.get());
        //find out min salaried employee.
        Optional<Employee> minSalariedEmp=getEmployeeList().stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Min Salaried Employee: "+minSalariedEmp.get());
        //print employee count working in each department
        Map<Integer, Long> getCountByDepartment= getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(getCountByDepartment);
        //print employees by department
        Map<Integer,List<Employee>> getEmployeesByDepartment=getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
        getEmployeesByDepartment.forEach((key, value) -> System.out.println("department : " + key + ",employees: " + value));
        //print employees by status
        Map<String,List<Employee>> getEmployeesByStatus=getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.toList()));
        getEmployeesByStatus.forEach((key, value) -> System.out.println("status : " + key + ",employees: " + value));
        //print max salaried employee among active employees.
        List<Employee> allActiveEmployeeList=getEmployeesByStatus.get("active");
        Optional<Employee> maxSalariedInActiveEmp=allActiveEmployeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalariedInActiveEmp.get());

        //print max salary from each department
        Map<Integer,Optional<Employee>> topDepartmentWiseSalary=getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        topDepartmentWiseSalary.entrySet().forEach(e-> System.out.println(e.getValue().get()));
    }
}
