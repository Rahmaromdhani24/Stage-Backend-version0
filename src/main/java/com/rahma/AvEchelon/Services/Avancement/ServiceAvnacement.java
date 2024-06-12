package com.rahma.AvEchelon.Services.Avancement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahma.AvEchelon.Entity.Avancement;
import com.rahma.AvEchelon.Repository.AvancementRepository;

@Service
public class ServiceAvnacement implements IServiceAvancement {
	 @Autowired  AvancementRepository  repository;
	 
	@Override
	public Avancement findAVPersonnelByMatricule(String matricule) {
		// TODO Auto-generated method stub
		return repository.findByMle(matricule);
	}

	@Override
	public List<Avancement> findAllAvancements() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Avancement updateNote(Double note) {
		// TODO Auto-generated method stub
		return null;
	}

}
