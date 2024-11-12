package com.example.projectspring.dao;

import com.example.projectspring.bean.Echelon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EchelonDao extends JpaRepository<Echelon, Integer> {
    Echelon findByCode(String code);
}
