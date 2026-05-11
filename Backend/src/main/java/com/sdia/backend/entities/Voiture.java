package com.sdia.backend.entities;

import com.sdia.backend.enums.BoiteVitesse;
import com.sdia.backend.enums.TypeCarburant;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Voiture")

@Data @NoArgsConstructor @AllArgsConstructor
public class Voiture  extends Vehicule{

    private Integer nombrePortes;
    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;
    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;


}
