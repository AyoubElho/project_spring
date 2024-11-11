package projet.mission.project1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.mission.project1.bean.Employee;
import projet.mission.project1.bean.Grade;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
    Employee findByCode(String code);
    int deleteEmployeeByCode(String code);
}
