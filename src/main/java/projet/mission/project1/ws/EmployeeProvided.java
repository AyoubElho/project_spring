package projet.mission.project1.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projet.mission.project1.bean.Employee;
import projet.mission.project1.service.EmployeeService;

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
