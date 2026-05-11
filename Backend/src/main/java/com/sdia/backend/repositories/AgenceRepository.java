package com.sdia.backend.repositories;

import com.sdia.backend.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
