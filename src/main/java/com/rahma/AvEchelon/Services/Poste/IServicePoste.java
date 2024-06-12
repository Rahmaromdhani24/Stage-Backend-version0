package com.rahma.AvEchelon.Services.Poste;

import java.util.List;
import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Entity.Poste;

public interface IServicePoste {

	  public List<Poste> findAllPostes();
	  public  Personnels findPersonnelByMle(String mle);
	 
}
