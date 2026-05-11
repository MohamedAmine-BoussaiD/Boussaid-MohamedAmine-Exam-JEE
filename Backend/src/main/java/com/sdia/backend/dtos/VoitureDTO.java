package com.sdia.backend.dtos;

import com.sdia.backend.entities.Agence;
import com.sdia.backend.entities.Vehicule;
import com.sdia.backend.enums.BoiteVitesse;
import com.sdia.backend.enums.Statut;
import com.sdia.backend.enums.TypeCarburant;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
public class VoitureDTO extends VehiculeDTO {

    private Long id ;
    private String marque ;
    private String modele ;
    private String matricule ;
    private double prixParJour ;
    private Date dateMiseEnService;
    private Statut statut ;
    private Agence agence ;
    private Integer nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;


}
