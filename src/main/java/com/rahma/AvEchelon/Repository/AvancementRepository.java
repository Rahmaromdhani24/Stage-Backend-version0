package com.rahma.AvEchelon.Repository;

import com.rahma.AvEchelon.Entity.Avancement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvancementRepository extends JpaRepository<Avancement, Integer>{

	Avancement findByMle(String matricule);

}