package com.example.projectspring.dao;

import com.example.projectspring.bean.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionDao extends JpaRepository<Mission , Long> {
}
