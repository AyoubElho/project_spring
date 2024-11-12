package com.example.projectspring.ws;

import com.example.projectspring.bean.TypeMission;
import com.example.projectspring.service.TypeMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("type")
public class TypeMissionProvided {

    @Autowired
    private TypeMissionService missionService;

    @GetMapping("find/id/{id}")
    public Optional<TypeMission> findById(@PathVariable Long id) {
        return missionService.findById(id);
    }
}
