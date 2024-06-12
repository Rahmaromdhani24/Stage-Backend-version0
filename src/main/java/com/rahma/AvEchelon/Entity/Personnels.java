package com.rahma.AvEchelon.Entity;

import jakarta.persistence.*;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Data
@Entity
@Table(name="t_personnels")
public class Personnels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    
    @Column(name="Mle")
    private String mle;
    
    @Column(name="NOM")
    private String nom;
    
    @Column(name="Prenom")
    private String prenom;
    
    @Column(name="CIN")
    private Integer cin;
    
    @Column(name="Date_CIN")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateCIN;
    
    @Column(name="Sexe")
    private String sexe;
    
    @Column(name="Nom_P")
    private String nomP;
    
    @Column(name="Nom_M")
    private String nomM;
    
    @Column(name="Date_N")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateN;
    
    @Column(name="Lieu_N")
    private String lieuN;
    
    @Column(name="Num_CNSS")
    private String numCNSS;
    
    @Column(name="Adresse")
    private String adresse;
    
    @Column(name="Ville")
    private String ville;
    
    @Column(name="CPostal")
    private Integer cpostal;
    
    @Column(name="S_F")
    private String sF;
    
    @Column(name="Motif_Sortie")
    private String motifSortie;
    
    @Column(name="Date_Anc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateAnc;
    
    @Column(name="Date_Entre_Etab")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateEntreEtab;
    
    @Column(name="Date_Sortie_Etab")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateSortieEtab;
    
    @Column(name="Tel")
    private String telephone;

	public Personnels() {
		super();
	}

	public Personnels(Integer id, String mle, String nom, String prenom, Integer cin, Date dateCIN, String sexe,
			String nomP, String nomM, Date dateN, String lieuN, String numCNSS, String adresse, String ville,
			Integer cpostal, String sF, String motifSortie, Date dateAnc, Date dateEntreEtab, Date dateSortieEtab,
			String telephone) {
		super();
		this.id = id;
		this.mle = mle;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.dateCIN = dateCIN;
		this.sexe = sexe;
		this.nomP = nomP;
		this.nomM = nomM;
		this.dateN = dateN;
		this.lieuN = lieuN;
		this.numCNSS = numCNSS;
		this.adresse = adresse;
		this.ville = ville;
		this.cpostal = cpostal;
		this.sF = sF;
		this.motifSortie = motifSortie;
		this.dateAnc = dateAnc;
		this.dateEntreEtab = dateEntreEtab;
		this.dateSortieEtab = dateSortieEtab;
		this.telephone = telephone;
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

	public String getPrenom() {
		return prenom;
	}

	public Integer getCin() {
		return cin;
	}

	public Date getDateCIN() {
		return dateCIN;
	}

	public String getSexe() {
		return sexe;
	}

	public String getNomP() {
		return nomP;
	}

	public String getNomM() {
		return nomM;
	}

	public Date getDateN() {
		return dateN;
	}

	public String getLieuN() {
		return lieuN;
	}

	public String getNumCNSS() {
		return numCNSS;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getVille() {
		return ville;
	}

	public Integer getCpostal() {
		return cpostal;
	}

	public String getsF() {
		return sF;
	}

	public String getMotifSortie() {
		return motifSortie;
	}

	public Date getDateAnc() {
		return dateAnc;
	}

	public Date getDateEntreEtab() {
		return dateEntreEtab;
	}

	public Date getDateSortieEtab() {
		return dateSortieEtab;
	}

	public String getTelephone() {
		return telephone;
	}
	
	
    
    
    
}