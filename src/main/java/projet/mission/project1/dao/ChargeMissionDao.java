package projet.mission.project1.dao;

import projet.mission.project1.bean.ChargeMission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeMissionDao extends JpaRepository<ChargeMission ,Long> {
}
