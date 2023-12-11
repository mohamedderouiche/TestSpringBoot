package tn.esprit.mohamedaminederouicheexblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="vol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vol {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idVol;
    @Column(name="dateDepart")
    private LocalDate dateDepart;
    @Column(name="dateArrive")
    private LocalDate dateArrive;

    @ManyToOne
    private Aeroport aeroport ;

    @ManyToOne
    private Aeroport aero ;

    @OneToMany(mappedBy = "vol", cascade = CascadeType.ALL)
    private List<Reservation> reservations=new ArrayList<>();
}
