package com.rahma.AvEchelon.Services.Sanctions;

import java.util.List;
import com.rahma.AvEchelon.Entity.Personnels;

public interface IServiceSanction {

	  public List<Personnels> findAllPersonnels();
	  public Personnels findPersonnelByMle(String mle);
	 
}
