package com.example.projectspring.dao;

import com.example.projectspring.bean.Echelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EchelleDao extends JpaRepository<Echelle, Long> {
    Echelle findByCode(String code);
    int deleteByCode(String code);
}
