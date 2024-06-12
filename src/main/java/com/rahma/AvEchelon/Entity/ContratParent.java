package com.rahma.AvEchelon.Entity;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="t_contrat_parent")
public class ContratParent {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	  
	    @Column(name="Mle")
	    private String mle;

	    @Column(name="Date_Entree_Etab")
	    private Date dateEntreeEtab;
	    
	    @Column(name="Type")
	    private String type;
	    
	    @OneToMany(mappedBy = "contratParent", cascade = CascadeType.ALL , orphanRemoval = true)
		@JsonProperty(access =Access.WRITE_ONLY)
	    private List<ContratDetails> contratDetails;
	    
		public ContratParent() {
			super();
		}

		public ContratParent(Integer id, String mle, Date dateEntreeEtab, String type) {
			super();
			this.id = id;
			this.mle = mle;
			this.dateEntreeEtab = dateEntreeEtab;
			this.type = type;
		}

		public Integer getId() {
			return id;
		}

		public String getMle() {
			return mle;
		}

		public Date getDateEntreeEtab() {
			return dateEntreeEtab;
		}

		public String getType() {
			return type;
		}

		public List<ContratDetails> getContratDetails() {
			return contratDetails;
		}

		public void setContratDetails(List<ContratDetails> contratDetails) {
			this.contratDetails = contratDetails;
		}
	    
	    
}
