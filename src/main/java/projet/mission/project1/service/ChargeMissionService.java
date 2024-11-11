package projet.mission.project1.service;

import projet.mission.project1.bean.ChargeMission;
import projet.mission.project1.dao.ChargeMissionDao;
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
