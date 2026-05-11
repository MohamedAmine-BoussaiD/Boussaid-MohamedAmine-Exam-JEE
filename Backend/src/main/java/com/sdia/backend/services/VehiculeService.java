package com.sdia.backend.services;

import com.sdia.backend.dtos.MotoDTO;
import com.sdia.backend.dtos.VehiculeDTO;
import com.sdia.backend.dtos.VoitureDTO;
import com.sdia.backend.entities.Moto;
import com.sdia.backend.entities.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VehiculeService {

    List<VehiculeDTO> getVehicules();
    VoitureDTO saveVoiture(VoitureDTO voitureDTO);

    MotoDTO saveMoto(MotoDTO motoDTO);
}
