package com.example.projectspring.bean;

<<<<<<< HEAD:src/main/java/projet/mission/project1/bean/Mission.java
import projet.mission.project1.enums.EtatMission;
=======
import com.example.projectspring.enums.Etat;
>>>>>>> parent of ab95204 (change repo name):src/main/java/com/example/projectspring/bean/Mission.java
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
<<<<<<< HEAD:src/main/java/projet/mission/project1/bean/Mission.java
import java.util.List;
=======
import java.util.Date;
>>>>>>> parent of ab95204 (change repo name):src/main/java/com/example/projectspring/bean/Mission.java
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
    private EtatMission etatMission;

    @ManyToOne
    private TypeMission typeMission;

    @OneToMany(mappedBy = "chargeMission")
    private List<ChargeMission> chargeMissions;

    // Constructors, Getters, and Setters
}
