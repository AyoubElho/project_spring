package com.example.projectspring.service;

import com.example.projectspring.bean.ChargeMission;
import com.example.projectspring.bean.Mission;
import com.example.projectspring.bean.TypeMission;
import com.example.projectspring.dao.ChargeMissionDao;
import com.example.projectspring.dao.MissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {
    @Autowired
    private MissionDao missionDao;

    @Autowired
    private TypeMissionService missionService;

    @Autowired
    private ChargeMissionService chargeMissionService;

    public int save(Mission mission) {
        Optional<TypeMission> mission1 = missionService.findById(mission.getType().getId());
        Optional<ChargeMission> chargeMission = chargeMissionService.findById(mission.getCharge().getId());
        mission.setType(mission1.get());
        mission.setCharge(chargeMission.get());
        missionDao.save(mission);
        missionDao.save(mission);
        return 1;
    }

    public List<Mission> findAll() {
        return missionDao.findAll();
    }

    public Optional<Mission> findById(Long id) {
        return missionDao.findById(id);
    }
}

