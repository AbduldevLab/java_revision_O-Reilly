package com.abduldevlab.expenses;
import com.abduldevlab.expenses.domain.Department;
import com.abduldevlab.expenses.domain.Employee;
import com.abduldevlab.expenses.domain.Employees;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setTitle("Mr");
        employee1.setFirstName(("Abdul"));
        employee1.setSurname(("DevLab"));

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));
        Employee employee2 = new Employee(2, "Manager");
        employee2.setTitle("Dr");
        employee2.setFirstName("Denis");
        employee2.setSurname("yellow");

        Employees employees = new Employees(15);
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(new Employee(3, "Mrs", "Susan", "Brown", "Director", Department.MARKETING));

        employees.printEmployees();


        Employee foundEmployee = employees.findBySurname("Brown");
        System.out.println("Found " + foundEmployee.getMailingName());

        Employee foundEmployee2 = employees.findBySurname("Sid");
        System.out.println("Didn't find " + (foundEmployee2 == null));

//        Department financeDept = new Department("Finance", "Abduldevlab");
//        financeDept.getManagerName();
    }
}
