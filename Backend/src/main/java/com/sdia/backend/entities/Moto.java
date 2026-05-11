package com.sdia.backend.entities;

import com.sdia.backend.enums.TypeMoto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Moto")

@Data  @NoArgsConstructor  @AllArgsConstructor
public class Moto extends Vehicule {

    private Integer cylindree ;
    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;
    private Boolean casqueInclus;
}
