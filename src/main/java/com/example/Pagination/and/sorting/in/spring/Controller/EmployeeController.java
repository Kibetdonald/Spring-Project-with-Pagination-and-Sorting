package com.example.Pagination.and.sorting.in.spring.Controller;

import com.example.Pagination.and.sorting.in.spring.Models.Employee;
import com.example.Pagination.and.sorting.in.spring.Repository.EmployeeRepository;
import com.example.Pagination.and.sorting.in.spring.Services.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping(value = "/employee")
    public Employee createEmployee(@RequestBody Employee emp) {
       return employeeService.createEmployee(emp);

    }
    @PutMapping(value = "/updateEmp")
    public void updateEmployee(@RequestBody Employee emp) {
        employeeService.updateEmployee(emp);

    }

}
