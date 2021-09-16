package io.reactive;

public class Employee {

    private int id;
    private String name;
    private int department;
    private String status;
    private int salary;

    public Employee(int id, String name, int department, String status, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.status = status;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
