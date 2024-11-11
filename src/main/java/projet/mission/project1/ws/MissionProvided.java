package projet.mission.project1.ws;

import projet.mission.project1.bean.Mission;
import projet.mission.project1.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mission")
public class MissionProvided {

    @Autowired
    private MissionService missionService;

    @PostMapping("save")
    public int save(@RequestBody Mission mission) {
        return missionService.save(mission);
    }

    @GetMapping("all")
    public List<Mission> findAll() {
        return missionService.findAll();
    }

    @GetMapping("find/id/{id}")
    public Optional<Mission> findById(@PathVariable Long id) {
        return missionService.findById(id);
    }
}
