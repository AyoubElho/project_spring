package com.example.projectspring.ws;

import com.example.projectspring.bean.Echelle;
import com.example.projectspring.service.EchelonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
