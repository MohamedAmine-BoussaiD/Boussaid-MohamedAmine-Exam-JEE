package com.sdia.backend.mappers;

import com.sdia.backend.dtos.MotoDTO;
import com.sdia.backend.dtos.VoitureDTO;
import com.sdia.backend.entities.Moto;
import com.sdia.backend.entities.Voiture;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service

public class VehiculeMapper {

    public VoitureDTO fromVoitureToVoitureDTO(Voiture voiture){
        VoitureDTO voitureDTO = new VoitureDTO();
        BeanUtils.copyProperties(voiture,voitureDTO);
        return voitureDTO;
    }

    public Voiture fromVoitureDTOtoVoiture(VoitureDTO voitureDTO){
        Voiture voiture = new Voiture();
        BeanUtils.copyProperties(voitureDTO,voiture);
        return voiture;
    }

    public MotoDTO fromMotoToMotoDTO(Moto moto){
        MotoDTO motoDTO = new MotoDTO();
        BeanUtils.copyProperties(moto,motoDTO);
        return motoDTO;
    }

    public Moto fromMotoDTOtoMoto(MotoDTO motoDTO){
        Moto moto = new Moto();
        BeanUtils.copyProperties(motoDTO,moto);
        return moto;
    }
}
