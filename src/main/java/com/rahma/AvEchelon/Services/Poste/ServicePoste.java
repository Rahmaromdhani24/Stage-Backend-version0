package com.rahma.AvEchelon.Services.Poste;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Entity.Poste;
import com.rahma.AvEchelon.Repository.PosteRepository;

@Service
public class ServicePoste implements IServicePoste {

	 @Autowired  PosteRepository  repository;

	@Override
	public List<Poste> findAllPostes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Personnels findPersonnelByMle(String mle) {
		// TODO Auto-generated method stub
		return repository.findByMle(mle);
	}
}
