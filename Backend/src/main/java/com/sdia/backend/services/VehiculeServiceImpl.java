package com.sdia.backend.services;


import com.sdia.backend.dtos.MotoDTO;
import com.sdia.backend.dtos.VehiculeDTO;
import com.sdia.backend.dtos.VoitureDTO;
import com.sdia.backend.entities.Moto;
import com.sdia.backend.entities.Vehicule;
import com.sdia.backend.entities.Voiture;
import com.sdia.backend.mappers.VehiculeMapper;
import com.sdia.backend.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {

    private VehiculeRepository vehiculeRepository;
    private VehiculeMapper vehiculeMapper;

    @Override
    public List<VehiculeDTO> getVehicules() {
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        List<VehiculeDTO> vehiculeDTOList= vehicules.stream()
                .map(vehicule -> {
                    if (vehicule instanceof  Voiture){
                        return vehiculeMapper.fromVoitureToVoitureDTO((Voiture) vehicule);
                    }
                    else {
                        return vehiculeMapper.fromMotoToMotoDTO((Moto) vehicule);
                    }
                }).collect(Collectors.toList());
        return vehiculeDTOList;
    }

    @Override
    public VoitureDTO saveVoiture(VoitureDTO voitureDTO) {
        Voiture voiture = vehiculeMapper.fromVoitureDTOtoVoiture(voitureDTO);
        return  vehiculeMapper.fromVoitureToVoitureDTO(vehiculeRepository.save(voiture) );
    }

    @Override
    public MotoDTO saveMoto(MotoDTO motoDTO) {
        Moto moto = vehiculeMapper.fromMotoDTOtoMoto(motoDTO);
        return  vehiculeMapper.fromMotoToMotoDTO(vehiculeRepository.save(moto) );
    }
}



