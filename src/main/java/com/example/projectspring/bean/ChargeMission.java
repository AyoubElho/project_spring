package com.example.projectspring.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class ChargeMission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String description;
    private String code;
    private BigDecimal montant;
    private LocalDate dateChargeMission;
    @ManyToOne
    private Mission mission;
}
