package projet.mission.project1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.mission.project1.bean.Echelon;
@Repository
public interface EchelonDao extends JpaRepository<Echelon, Integer> {
    Echelon findByCode(String code);
}
