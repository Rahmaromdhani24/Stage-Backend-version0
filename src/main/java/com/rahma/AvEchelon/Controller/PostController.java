package com.rahma.AvEchelon.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahma.AvEchelon.Entity.Personnels;
import com.rahma.AvEchelon.Entity.Poste;
import com.rahma.AvEchelon.Repository.PosteRepository;
import com.rahma.AvEchelon.Services.Poste.ServicePoste;


@RestController
@RequestMapping("Poste")
public class PostController {

	 @Autowired ServicePoste service;
	 @Autowired PosteRepository repository;
	 
	 @GetMapping("/all")
	    public List<Poste> getall(){
	        return service.findAllPostes();
	    }
 /*******************************************************************/
	 
	 @GetMapping( "/{mle}" )
		public Personnels getAdmin(@PathVariable String mle)  {

				return service.findPersonnelByMle(mle);
		}
	 
}
