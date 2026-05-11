package com.sdia.backend.entities;

import com.sdia.backend.enums.Statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType = DiscriminatorType.STRING)

@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String marque ;
    private String modele ;
    private String matricule ;
    private double prixParJour ;
    private Date dateMiseEnService;
    private Statut statut ;

    @ManyToOne
    private Agence agence ;

}
