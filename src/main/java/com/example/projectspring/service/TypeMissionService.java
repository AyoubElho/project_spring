import com.example.projectspring.dao.TypeMissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeMissionService {

    @Autowired
    private TypeMissionDao missionDao;

    public Optional<TypeMission> findById(Long id) {
        return Optional.ofNullable(missionDao.findById(id).orElse(null));
    }
}
