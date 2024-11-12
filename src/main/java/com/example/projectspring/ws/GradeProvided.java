package com.example.projectspring.ws;

import com.example.projectspring.bean.Grade;
import com.example.projectspring.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/grade/")
@RestController
public class GradeProvided {
    @Autowired
    private GradeService gradeService;

    @GetMapping("")
    public List<Grade> findAll() {
        return gradeService.findAll();
    }

    @GetMapping("code/{code}")
    public Grade findByCode(@PathVariable String code) {
        return gradeService.findByCode(code);
    }

    @Transactional
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return gradeService.deleteByCode(code);
    }

    @PutMapping("")
    public void save(@RequestBody Grade grade) {
        gradeService.save(grade);
    }
}
