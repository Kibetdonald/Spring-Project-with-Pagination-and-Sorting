package com.example.Pagination.and.sorting.in.spring.Repository;

import com.example.Pagination.and.sorting.in.spring.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
