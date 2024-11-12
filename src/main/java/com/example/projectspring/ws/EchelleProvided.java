package projet.mission.project1.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projet.mission.project1.bean.Echelle;
import projet.mission.project1.service.EchelleService;

import java.util.List;

@RequestMapping("/echelle/")
@RestController
public class EchelleProvided {
    @Autowired
    private EchelleService echelleService;

    @GetMapping("")
    public List<Echelle> findAll() {
        return echelleService.findAll();
    }

    @PutMapping("")
    public void save(@RequestBody Echelle echelle) {
        echelleService.save(echelle);
    }

    @GetMapping("code/{code}")
    public Echelle findByCode(@PathVariable String code) {
        return echelleService.findByCode(code);
    }

    @Transactional
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return echelleService.deleteByCode(code);
    }
}
