package projet.mission.project1.dao;

import projet.mission.project1.bean.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionDao extends JpaRepository<Mission , Long> {
}
