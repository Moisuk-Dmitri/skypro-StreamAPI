package com.skypro.StreamAPI.StreamAPI.Services;

import com.skypro.StreamAPI.StreamAPI.Domain.Employee;
import com.skypro.StreamAPI.StreamAPI.Exceptions.AddingEmployeeException;
import com.skypro.StreamAPI.StreamAPI.Exceptions.EmptyMapException;
import com.skypro.StreamAPI.StreamAPI.Exceptions.InvalidDepartmentNumberException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (employeeList.stream()
                .anyMatch(e -> e.equals(employee))) {
            throw new AddingEmployeeException("Such employee already exists");
        }

        employeeList.add(employee);
    }


    public Employee getEmployeeById(int id) {
        return employeeList.get(id);
    }

    public void deleteEmployeeById(int id) {
        employeeList.remove(id);
    }

    public List<Employee> getAll() {
        return employeeList.stream()
                .collect(Collectors.toList());
    }
}
