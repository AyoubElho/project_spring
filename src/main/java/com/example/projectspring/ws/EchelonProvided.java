package projet.mission.project1.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projet.mission.project1.bean.Echelle;
import projet.mission.project1.service.EchelonService;

@RequestMapping("/echelon/")
@RestController
public class EchelonProvided {
    @Autowired
    private EchelonService echelonService;

    @GetMapping("")
    public Echelle findByCode(String code) {
        return echelonService.findByCode(code);
    }

    @DeleteMapping("")
    @Transactional
    public int deleteByCode(String code) {
        return echelonService.deleteByCode(code);
    }

    @PutMapping("")
    public void save(Echelle echelle) {
        echelonService.save(echelle);
    }
}
