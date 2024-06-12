package com.rahma.AvEchelon.Services.Sanctions;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Repository.PersonnelsRepository;
import com.rahma.AvEchelon.Services.Personnels.IServicePersonnles;

@Service
public class ServiceSanction implements IServicePersonnles {

	 @Autowired  PersonnelsRepository  repository;

	@Override
	public List<Personnels> findAllPersonnels() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Personnels findPersonnelByMle(String mle) {
		// TODO Auto-generated method stub
		return repository.findByMle(mle);
	}

	
	
}
