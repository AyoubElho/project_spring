package com.example.projectspring.service;

import com.example.projectspring.bean.Echelle;
import com.example.projectspring.dao.EchelleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EchelonService {
    @Autowired
    private EchelleDao echelleDao;

    public Echelle findByCode(String code) {
        return echelleDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return echelleDao.deleteByCode(code);
    }

    public void save(Echelle echelle) {
        echelleDao.save(echelle);
    }

}
