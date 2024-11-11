package projet.mission.project1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.mission.project1.bean.Grade;
@Repository
public interface GradeDao extends JpaRepository<Grade, Integer> {
    Grade findByCode(String code);
    int deleteByCode(String code);
}
