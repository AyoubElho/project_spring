package com.example.projectspring.service;

import com.example.projectspring.bean.Grade;
import com.example.projectspring.dao.GradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
