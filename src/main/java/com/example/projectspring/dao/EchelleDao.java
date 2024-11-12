package projet.mission.project1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.mission.project1.bean.Echelle;
@Repository
public interface EchelleDao extends JpaRepository<Echelle, Long> {
    Echelle findByCode(String code);
    int deleteByCode(String code);
}
