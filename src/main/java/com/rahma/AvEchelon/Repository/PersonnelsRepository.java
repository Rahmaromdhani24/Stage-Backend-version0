package com.rahma.AvEchelon.Repository;


import com.rahma.AvEchelon.Entity.Personnels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelsRepository extends JpaRepository<Personnels, Integer>{

	Personnels findByMle(String mle);


}