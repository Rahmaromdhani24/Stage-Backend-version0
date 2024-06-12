package com.rahma.AvEchelon.Entity;

import java.sql.Date;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name=" t_avancement")
public class Avancement {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	    
	    @Column(name="MLE")
	    private String mle;
	    
	    @Column(name="NOM")
	    private String nom;
	    
	    @Column(name="QUALIFICATION")
	    private String qualification;
	    
	    @Column(name="CAT")
	    private String categorie;
	    
	    @Column(name="S_CAT")
	    private String sousCategorie;
	    
	    @Column(name="ECH")
	    private String echelon;
	    
	    @Column(name="SBASE")
	    private String sBase;
	    
	    @Column(name="TH")
	    private String th;
	    
	    @Column(name="IND_DIFF")
	    private String ind_Diff;
	    
	    @Column(name="D_EFFET")
	    private Date dateEffet;
	    
	    @Column(name="D_P_AV")
	    private Date dateProchainAv;
	    
	    @Column(name="OBSERVATION")
	    private String observation;

		public Avancement() {
			super();
		}

		public Avancement(Integer id, String mle, String nom, String qualification, String categorie,
				String sousCategorie, String echelon, String sBase, String th, String ind_Diff, Date dateEffet,
				Date dateProchainAv, String observation) {
			super();
			this.id = id;
			this.mle = mle;
			this.nom = nom;
			this.qualification = qualification;
			this.categorie = categorie;
			this.sousCategorie = sousCategorie;
			this.echelon = echelon;
			this.sBase = sBase;
			this.th = th;
			this.ind_Diff = ind_Diff;
			this.dateEffet = dateEffet;
			this.dateProchainAv = dateProchainAv;
			this.observation = observation;
		}

		public Integer getId() {
			return id;
		}

		public String getMle() {
			return mle;
		}

		public String getNom() {
			return nom;
		}

		public String getQualification() {
			return qualification;
		}

		public String getCategorie() {
			return categorie;
		}

		public String getSousCategorie() {
			return sousCategorie;
		}

		public String getEchelon() {
			return echelon;
		}

		public String getsBase() {
			return sBase;
		}

		public String getTh() {
			return th;
		}

		public String getInd_Diff() {
			return ind_Diff;
		}

		public Date getDateEffet() {
			return dateEffet;
		}

		public Date getDateProchainAv() {
			return dateProchainAv;
		}

		public String getObservation() {
			return observation;
		}
	    
	    
}
