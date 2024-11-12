package com.example.projectspring.ws;

import com.example.projectspring.bean.Employee;
import com.example.projectspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee/")
@RestController
public class EmployeeProvided {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("addemployee")
    public int addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("findbycode/code/{code}")
    public Employee findByCode(@PathVariable String code) {
        return employeeService.findByCode(code);
    }

    @Transactional
    @DeleteMapping("deletebycode/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return employeeService.deleteByCode(code);
    }
}
