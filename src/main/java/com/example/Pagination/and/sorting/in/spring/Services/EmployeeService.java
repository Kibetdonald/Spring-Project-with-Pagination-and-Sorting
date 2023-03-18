package com.example.Pagination.and.sorting.in.spring.Services;

import com.example.Pagination.and.sorting.in.spring.Models.Department;
import com.example.Pagination.and.sorting.in.spring.Models.Employee;
import com.example.Pagination.and.sorting.in.spring.Repository.DepartmentRepository;
import com.example.Pagination.and.sorting.in.spring.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository = null;

    @Autowired
    DepartmentRepository departmentRepository = null;

    List<Employee> getAllEmployees(int pageNo, int pageSize, String sortBy);


    default Employee createEmployee(Employee employee) {
        Department department = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
        if (department != null) {
            employee.setDepartment(department);
            return employeeRepository.save(employee);

        }
        return null;
    }
}