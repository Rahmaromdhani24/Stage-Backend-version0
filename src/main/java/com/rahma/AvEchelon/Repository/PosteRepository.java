package com.rahma.AvEchelon.Repository;


import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Entity.Poste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosteRepository extends JpaRepository<Poste, Integer>{

	Personnels findByMle(String mle);



}