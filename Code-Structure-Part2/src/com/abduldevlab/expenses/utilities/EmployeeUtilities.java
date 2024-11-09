package com.abduldevlab.expenses.utilities;

import com.abduldevlab.expenses.domain.Employee;
import com.abduldevlab.expenses.domain.Employees;

public class EmployeeUtilities {
    public boolean employeeExists(Employees employees, Employee employee){
        return employees.findBySurname(employee.getSurname()) != null;
    }
}
