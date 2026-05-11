package com.sdia.backend.dtos;

import com.sdia.backend.entities.Vehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class AgenceDTO {

    private Long id ;
    private String nom ;
    private String adresse ;
    private String ville ;
    private String telephone ;


}
