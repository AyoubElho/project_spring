package com.example.projectspring.service;

import com.example.projectspring.bean.Employee;
import com.example.projectspring.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Employee findByCode(String code) {
        return employeeDao.findByCode(code);
    }

    public int addEmployee(Employee employee) {
        if (employeeDao.findByCode(employee.getCode())!=null){
            return -1;
        }else if (employee.getEchelon()==null){
            return -2;
        }else{
            employeeDao.save(employee);
            return 1;
        }
    }

    public int deleteByCode(String code) {
        if(employeeDao.findByCode(code)!=null){
            return -1;
        }else{
            employeeDao.deleteEmployeeByCode(code);
            return 1;
        }
    }

}
