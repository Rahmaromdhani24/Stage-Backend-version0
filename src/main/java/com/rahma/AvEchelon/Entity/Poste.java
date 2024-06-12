package com.rahma.AvEchelon.Entity;

import java.sql.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_postes")
public class Poste {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	  
	    @Column(name="Mle")
	    private String mle;

	    @Column(name="Fonction")
	    private String fonction;
	    
	    @Column(name="Position")
	    private String position;

	    @Column(name="Qualification")
	    private String qualification;
	    
	    @Column(name="College")
	    private String college;
	    
	    @Column(name="Date_Poste")
	    private Date datePoste;
	    
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "Id_Dep" , unique = true,nullable=false)
        @OnDelete(action = OnDeleteAction.CASCADE)
	    private Departement departement;
	   
	    //@Column(name="Id_Dep")
	    //private String idDep;
		
	    @Column(name="Nom_Dep")
	    private String nomDep;

	    @Column(name="Id_Service")
	    private String idSer;
	    
	    @Column(name="Nom_Service")
	    private String nomSer; 
	    
	    @Column(name="Ref")
	    private String ref;

		public Poste() {
			super();
		}

		public Poste(Integer id, String mle, String fonction, String position, String qualification, String college,
				Date datePoste, Departement departement, String nomDep, String idSer, String nomSer, String ref) {
			
			super();
			this.id = id;
			this.mle = mle;
			this.fonction = fonction;
			this.position = position;
			this.qualification = qualification;
			this.college = college;
			this.datePoste = datePoste;
			this.departement = departement;
			this.nomDep = nomDep;
			this.idSer = idSer;
			this.nomSer = nomSer;
			this.ref = ref;
		}

		public Integer getId() {
			return id;
		}

		public String getMle() {
			return mle;
		}

		public String getFonction() {
			return fonction;
		}

		public String getPosition() {
			return position;
		}

		public String getQualification() {
			return qualification;
		}

		public String getCollege() {
			return college;
		}

		public Date getDatePoste() {
			return datePoste;
		}

		public Departement getDepartement() {
			return departement;
		}

		public String getNomDep() {
			return nomDep;
		}

		public String getIdSer() {
			return idSer;
		}

		public String getNomSer() {
			return nomSer;
		}

		public String getRef() {
			return ref;
		}
	    
	    
}
