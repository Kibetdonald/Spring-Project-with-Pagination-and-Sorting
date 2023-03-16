package com.example.Pagination.and.sorting.in.spring.Repository;

import com.example.Pagination.and.sorting.in.spring.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
