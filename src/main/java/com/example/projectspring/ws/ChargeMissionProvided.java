package com.example.projectspring.ws;

import com.example.projectspring.bean.ChargeMission;
import com.example.projectspring.service.ChargeMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("charge")
public class ChargeMissionProvided {

    @Autowired
    private ChargeMissionService chargeMissionService;

    @GetMapping("find/id/{id}")
    public Optional<ChargeMission> findById(@PathVariable Long id){
        return chargeMissionService.findById(id);
    }
}
