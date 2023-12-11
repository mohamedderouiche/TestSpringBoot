package tn.esprit.mohamedaminederouicheexblanc.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="aeroport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aeroport {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idAeroport;
    @Column(name="nom")
    private String nom;
    @Column(name="codeAITA")
    private String codeAITA;
    @Column(name="telephone")
    private long telephone;

    @OneToMany(mappedBy = "aeroport", cascade = CascadeType.ALL)
    private List<Vol> vols=new ArrayList<>();
    @OneToMany(mappedBy = "aero",cascade = CascadeType.ALL)
    private List<Vol> Listvols=new ArrayList<>();
}
