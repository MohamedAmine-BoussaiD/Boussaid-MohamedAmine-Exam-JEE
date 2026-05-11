package com.sdia.backend;

import com.sdia.backend.dtos.MotoDTO;
import com.sdia.backend.dtos.VoitureDTO;
import com.sdia.backend.enums.BoiteVitesse;
import com.sdia.backend.enums.Statut;
import com.sdia.backend.enums.TypeCarburant;
import com.sdia.backend.enums.TypeMoto;
import com.sdia.backend.mappers.VehiculeMapper;
import com.sdia.backend.services.VehiculeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner initVehicules(VehiculeService vehiculeService, VehiculeMapper vehiculeMapper) {
        return args -> {

            // --- Voitures ---
            VoitureDTO v1 = new VoitureDTO();
            v1.setMarque("Renault");
            v1.setModele("Clio");
            v1.setMatricule("12345-A-1");
            v1.setPrixParJour(250.0);
            v1.setDateMiseEnService(new Date());
            v1.setStatut(Statut.DISPONIBLE);
            v1.setNombrePortes(5);
            v1.setTypeCarburant(TypeCarburant.ESSENCE);
            v1.setBoiteVitesse(BoiteVitesse.MANUELLE);
            vehiculeService.saveVoiture(v1);

            VoitureDTO v2 = new VoitureDTO();
            v2.setMarque("Dacia");
            v2.setModele("Logan");
            v2.setMatricule("67890-B-2");
            v2.setPrixParJour(200.0);
            v2.setDateMiseEnService(new Date());
            v2.setStatut(Statut.DISPONIBLE);
            v2.setNombrePortes(4);
            v2.setTypeCarburant(TypeCarburant.DIESEL);
            v2.setBoiteVitesse(BoiteVitesse.AUTOMATIQUE);
            vehiculeService.saveVoiture(v2);

            VoitureDTO v3 = new VoitureDTO();
            v3.setMarque("Toyota");
            v3.setModele("Yaris");
            v3.setMatricule("11223-C-3");
            v3.setPrixParJour(300.0);
            v3.setDateMiseEnService(new Date());
            v3.setStatut(Statut.ENMAINTENANCE);
            v3.setNombrePortes(5);
            v3.setTypeCarburant(TypeCarburant.HYBRIDE);
            v3.setBoiteVitesse(BoiteVitesse.AUTOMATIQUE);
            vehiculeService.saveVoiture(v3);


            MotoDTO m1 = new MotoDTO();
            m1.setMarque("Yamaha");
            m1.setModele("MT-07");
            m1.setMatricule("55500-D-4");
            m1.setPrixParJour(180.0);
            m1.setDateMiseEnService(new Date());
            m1.setStatut(Statut.DISPONIBLE);
            m1.setCylindree(700);
            m1.setTypeMoto(TypeMoto.SPORTIVE);
            m1.setCasqueInclus(true);
            vehiculeService.saveMoto(m1);

            MotoDTO m2 = new MotoDTO();
            m2.setMarque("Honda");
            m2.setModele("CB500");
            m2.setMatricule("66601-E-5");
            m2.setPrixParJour(150.0);
            m2.setDateMiseEnService(new Date());
            m2.setStatut(Statut.DISPONIBLE);
            m2.setCylindree(500);
            m2.setTypeMoto(TypeMoto.TOURING);
            m2.setCasqueInclus(false);
            vehiculeService.saveMoto(m2);

            MotoDTO m3 = new MotoDTO();
            m3.setMarque("Kawasaki");
            m3.setModele("Z400");
            m3.setMatricule("77702-F-6");
            m3.setPrixParJour(160.0);
            m3.setDateMiseEnService(new Date());
            m3.setStatut(Statut.LOUE);
            m3.setCylindree(400);
            m3.setTypeMoto(TypeMoto.SCOOTER);
            m3.setCasqueInclus(true);
            vehiculeService.saveMoto(m3);
        };
    }
}