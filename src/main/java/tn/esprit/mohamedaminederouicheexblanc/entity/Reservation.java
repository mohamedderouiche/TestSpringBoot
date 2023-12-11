package tn.esprit.mohamedaminederouicheexblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name="reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    private String idReservation;
    @Column(name="dateReservation")
    private LocalDate dateReservation;
    @Column(name="classPlace")
    @Enumerated(EnumType.STRING)
    private ClassPlace classPlace;
    @Column(name="etatReservation")
    @Enumerated(EnumType.STRING)
    private EtatReservation etatReservation;

    @ManyToOne
    private Vol vol ;

    @ManyToOne
    private Voyageur voyageur  ;
}
