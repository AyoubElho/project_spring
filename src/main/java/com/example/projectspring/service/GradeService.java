package projet.mission.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.mission.project1.bean.Grade;
import projet.mission.project1.dao.GradeDao;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeDao gradeDao;
    public List<Grade> findAll() {
        return gradeDao.findAll();
    }
    public Grade findByCode(String code) {
        return gradeDao.findByCode(code);
    }
    public int deleteByCode(String code) {
        return gradeDao.deleteByCode(code);
    }
    public void save(Grade grade) {
        gradeDao.save(grade);
    }
}
