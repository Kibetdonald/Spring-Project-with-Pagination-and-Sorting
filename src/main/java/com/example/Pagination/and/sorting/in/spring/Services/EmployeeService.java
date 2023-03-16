package com.example.Pagination.and.sorting.in.spring.Services;

import com.example.Pagination.and.sorting.in.spring.Models.Department;
import com.example.Pagination.and.sorting.in.spring.Models.Employee;
import com.example.Pagination.and.sorting.in.spring.Repository.DepartmentRepository;
import com.example.Pagination.and.sorting.in.spring.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        Department department = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
        if (department != null) {
            employee.setDepartment(department);
            return employeeRepository.save(employee);
        }
        return null;
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        if (existingEmployee != null) {
            Department department = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
            if (department != null) {
                existingEmployee.setFirstName(employee.getFirstName());
                existingEmployee.setLastName(employee.getLastName());
                existingEmployee.setEmail(employee.getEmail());
                existingEmployee.setPhoneNumber(employee.getPhoneNumber());
                existingEmployee.setDepartment(department);
                return employeeRepository.save(existingEmployee);
            }
        }
        return null;
    }
}
