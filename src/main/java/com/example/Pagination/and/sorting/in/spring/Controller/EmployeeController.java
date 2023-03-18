package com.example.Pagination.and.sorting.in.spring.Controller;

import com.example.Pagination.and.sorting.in.spring.Models.Employee;
import com.example.Pagination.and.sorting.in.spring.Repository.EmployeeRepository;
import com.example.Pagination.and.sorting.in.spring.Services.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy) {
        return employeeService.getAllEmployees(pageNo, pageSize, sortBy);
    }

    @PostMapping(value = "/employee")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee createEmployee(@RequestBody Employee emp) {
       return employeeService.createEmployee(emp);

    }


}
