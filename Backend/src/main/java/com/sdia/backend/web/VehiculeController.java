package com.sdia.backend.web;

import com.sdia.backend.dtos.VehiculeDTO;
import com.sdia.backend.services.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class VehiculeController {

    private VehiculeService vehiculeService;

    @GetMapping("/vehicules")
    public List<VehiculeDTO> getVehicules(){
        return vehiculeService.getVehicules();
    }
}
