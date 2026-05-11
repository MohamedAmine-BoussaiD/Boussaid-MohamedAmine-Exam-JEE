package com.sdia.backend.services;

import com.sdia.backend.dtos.VehiculeDTO;
import com.sdia.backend.dtos.VoitureDTO;
import com.sdia.backend.entities.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VehiculeService {

    List<VehiculeDTO> getVoitures();
    VoitureDTO saveVoiture(Voiture voiture);
}
