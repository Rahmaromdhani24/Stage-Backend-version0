package com.rahma.AvEchelon.Services.Personnels;

import java.util.List;
import com.rahma.AvEchelon.Entity.Personnels;

public interface IServicePersonnles {

	  public List<Personnels> findAllPersonnels();
	  public Personnels findPersonnelByMle(String mle);
	 
}
