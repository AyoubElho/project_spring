package projet.mission.project1.bean;

import projet.mission.project1.enums.EtatMission;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;
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
