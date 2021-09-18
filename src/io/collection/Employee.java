package io.collection;

public class Employee {

    private int id;
    private String name;

    @Override
    public boolean equals(Object obj) {
       if(this==obj)
           return true;
       if(obj==null)
           return false;
       if(this.getClass()!=obj.getClass())
           return false;
       Employee emp=(Employee)obj;
       return this.id==emp.id && this.name.equalsIgnoreCase(emp.name);
    }

    @Override
    public int hashCode() {
        return this.id*7387293*31;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
}
