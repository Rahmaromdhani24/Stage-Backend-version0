package com.rahma.AvEchelon.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Repository.PersonnelsRepository;
import com.rahma.AvEchelon.Services.Personnels.IServicePersonnles;
import com.rahma.AvEchelon.Services.Personnels.ServicePersonnels;
import com.rahma.AvEchelon.Services.Sanctions.ServiceSanction;

@RestController
@RequestMapping("Sanction")
public class SanctionController {

	 @Autowired ServiceSanction service;
	 
	 @GetMapping("/all")
	    public List<Personnels> getall(){
	        return service.findAllPersonnels();
	    }
 /*******************************************************************/
	 

}
