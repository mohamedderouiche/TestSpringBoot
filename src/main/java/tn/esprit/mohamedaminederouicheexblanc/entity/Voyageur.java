package tn.esprit.mohamedaminederouicheexblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="voyageur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Voyageur {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idVoyageur;
    @Column(name="nom")
    private  String nom;
    @Column(name="prenom")
    private  String prenom;
    @Column(name="dateNaissance")
    private LocalDate dateNaissance;

    @OneToMany(mappedBy = "voyageur", cascade = CascadeType.ALL)
    private List<Reservation> Vreservations=new ArrayList<>();
}

