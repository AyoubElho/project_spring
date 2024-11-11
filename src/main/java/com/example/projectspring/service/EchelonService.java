package projet.mission.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.mission.project1.bean.Echelle;
import projet.mission.project1.dao.EchelleDao;

@Service
public class EchelonService {
    @Autowired
    private EchelleDao echelleDao;

    public Echelle findByCode(String code) {
        return echelleDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return echelleDao.deleteByCode(code);
    }

    public void save(Echelle echelle) {
        echelleDao.save(echelle);
    }

}
