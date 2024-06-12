package com.rahma.AvEchelon.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahma.AvEchelon.Entity.Avancement;
import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Services.Avancement.IServiceAvancement;

@RestController
@RequestMapping("Avancement")
public class AvController {

	 @Autowired IServiceAvancement service;
	 
	 @GetMapping("/all")
	    public List<Avancement> getall(){
	        return service.findAllAvancements();
	    }
	 /********************************************************************/
	 @GetMapping( "/{mle}" )
		public Avancement getAdmin(@PathVariable String mle)  {

				return service.findAVPersonnelByMatricule(mle);
		}
	 
}
