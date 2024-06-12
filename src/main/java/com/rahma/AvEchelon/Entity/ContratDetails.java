package com.rahma.AvEchelon.Entity;

import java.sql.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="t_contrat_details")
public class ContratDetails {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "ID_Contrat_parent" , unique = true,nullable=false)
        @OnDelete(action = OnDeleteAction.CASCADE)
	    private ContratParent contratParent;
	   
	    
	    @Column(name="Date_D")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateDeb;
	    
	    @Column(name="Date_F")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateFin;
	    
	    @Column(name="Jours")
	    private String jours;
	    
	    @Column(name="Mois")
	    private String mois;

	    @Column(name="Annee")
	    private String annee;
	    
	    @Column(name="Qualification")
	    private String qualification;
	    
	    @Column(name="Type")
	    private String type;
	    
	    @Column(name="Ref")
	    private String ref;
	    
	    @Column(name="Date_Ref")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateRef;
	    
	    @Column(name="CDD_File")
	    private String cddFile;
	    
	    @Column(name="ID_AV")
	    private Integer idAvancement;

		public ContratDetails() {
			super();
		}

		public ContratDetails(Integer id, ContratParent contratParent, Date dateDeb, Date dateFin, String jours,
				String mois, String annee, String qualification, String type, String ref, Date dateRef, String cddFile,
				Integer idAvancement) {
			super();
			this.id = id;
			this.contratParent = contratParent;
			this.dateDeb = dateDeb;
			this.dateFin = dateFin;
			this.jours = jours;
			this.mois = mois;
			this.annee = annee;
			this.qualification = qualification;
			this.type = type;
			this.ref = ref;
			this.dateRef = dateRef;
			this.cddFile = cddFile;
			this.idAvancement = idAvancement;
		}

		public Integer getId() {
			return id;
		}

		public ContratParent getContratParent() {
			return contratParent;
		}

		public Date getDateDeb() {
			return dateDeb;
		}

		public Date getDateFin() {
			return dateFin;
		}

		public String getJours() {
			return jours;
		}

		public String getMois() {
			return mois;
		}

		public String getAnnee() {
			return annee;
		}

		public String getQualification() {
			return qualification;
		}

		public String getType() {
			return type;
		}

		public String getRef() {
			return ref;
		}

		public Date getDateRef() {
			return dateRef;
		}

		public String getCddFile() {
			return cddFile;
		}

		public Integer getIdAvancement() {
			return idAvancement;
		}
	
	    
	    
}
