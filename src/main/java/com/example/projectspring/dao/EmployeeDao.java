package com.example.projectspring.dao;

import com.example.projectspring.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
    Employee findByCode(String code);
    int deleteEmployeeByCode(String code);
}
