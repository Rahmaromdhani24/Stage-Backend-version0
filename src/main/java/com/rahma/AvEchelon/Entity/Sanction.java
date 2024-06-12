package com.rahma.AvEchelon.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="t_sanctions")
public class Sanction {
 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	    @Column(name="Mle")
	    private String mle;
	    @Column(name="Sanction")
	    private String sanction;   
	    @Column(name="D_Debut")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateDebut;   
	    @Column(name="Duree")
	    private int duree;   
	    @Column(name="D_Fin")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateFin;   
	    @Column(name="Motif")
	    private String motif;   
	    @Column(name="Ref")
	    private String ref;   
	    @Column(name="Date_ref")
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date dateRef;   
	    
	   public Sanction() {
			super();}
	   
	   

	public Sanction(Integer id, String mle, String sanction, Date dateDebut, int duree, Date dateFin, String motif,
			String ref, Date dateRef) {
		super();
		this.id = id;
		this.mle = mle;
		this.sanction = sanction;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.dateFin = dateFin;
		this.motif = motif;
		this.ref = ref;
		this.dateRef = dateRef;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMle() {
		return mle;
	}

	public void setMle(String mle) {
		this.mle = mle;
	}

	public String getSanction() {
		return sanction;
	}

	public void setSanction(String sanction) {
		this.sanction = sanction;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Date getDateRef() {
		return dateRef;
	}

	public void setDateRef(Date dateRef) {
		this.dateRef = dateRef;
	}


}
