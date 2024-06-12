package com.rahma.AvEchelon.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="t_departements")
public class Departement {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	    
	    @Column(name="Nom_Dep")
	    private String nomDep;
	    
	    @Column(name="Mle_Chef_Dep")
	    private String mleChefDep; 
	    
	    @Column(name="ID_dep_Sup")
	    private String idDepSup;  
	    
	    @Column(name="Type")
	    private String type;

	    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL , orphanRemoval = true)
		@JsonProperty(access =Access.WRITE_ONLY)
	    private List<Poste> postes;
	    
		public Departement() {
			super();
		}

		public Departement(Integer id, String nomDep, String mleChefDep, String idDepSup, String type) {
			super();
			this.id = id;
			this.nomDep = nomDep;
			this.mleChefDep = mleChefDep;
			this.idDepSup = idDepSup;
			this.type = type;
		}

		public Integer getId() {
			return id;
		}

		public String getNomDep() {
			return nomDep;
		}

		public String getMleChefDep() {
			return mleChefDep;
		}

		public String getIdDepSup() {
			return idDepSup;
		}

		public String getType() {
			return type;
		}   
	    
	    
	    
}
