package com.example.projectspring.dao;

import com.example.projectspring.bean.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GradeDao extends JpaRepository<Grade, Integer> {
    Grade findByCode(String code);
    int deleteByCode(String code);
}
