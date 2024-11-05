package com.example.projectspring.bean;

import com.example.projectspring.enums.Etat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class Mission {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code = UUID.randomUUID().toString();
    private String libelle;
    private String description;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateDebut;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToOne
    private TypeMission type;

    @OneToOne
    private ChargeMission charge;

    // Constructors, Getters, and Setters
}
