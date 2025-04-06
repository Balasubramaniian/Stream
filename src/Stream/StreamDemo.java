package Stream;

import java.util.*;
import java.util.stream.*;

public class StreamDemo{
   public static void main(String[] args){
	   List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", "IT", 85000),
	            new Employee(2, "Bob", "HR", 65000),
	            new Employee(3, "Charlie", "IT", 95000),
	            new Employee(4, "David", "Finance", 70000),
	            new Employee(5, "Eve", "IT", 90000)
	        );
	   
	   List<String> names = employees.stream()
               .map(Employee::getName)
               .collect(Collectors.toList());
       System.out.println("Names: " + names);
	   
   }

}

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }
}
