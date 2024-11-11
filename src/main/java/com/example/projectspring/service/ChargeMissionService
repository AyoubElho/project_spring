package com.example.projectspring.service;

import com.example.projectspring.bean.ChargeMission;
import com.example.projectspring.dao.ChargeMissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChargeMissionService {
    @Autowired
    private ChargeMissionDao missionDao;

    public Optional<ChargeMission> findById(Long id) {
        return missionDao.findById(id);
    }
}
