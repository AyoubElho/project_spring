package projet.mission.project1.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class ChargeMission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double montant;
    private LocalDate date;
}
