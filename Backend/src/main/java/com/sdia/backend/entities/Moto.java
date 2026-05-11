package com.sdia.backend.entities;

import com.sdia.backend.enums.TypeMoto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Moto")

@Data  @NoArgsConstructor  @AllArgsConstructor
public class Moto extends Vehicule {

    private Integer cylindree ;
    private TypeMoto typeMoto;
    private Boolean casqueInclus;
}
