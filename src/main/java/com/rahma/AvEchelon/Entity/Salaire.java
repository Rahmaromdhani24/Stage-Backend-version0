package com.rahma.AvEchelon.Entity;
import jakarta.persistence.*;
import lombok.*;

/*@Data
@Entity
@Table(name="t_salaire")*/
public class Salaire {

	    /*@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="ID")
	    private Integer id;
	  
	    @Column(name="CAT")
	    private String categorie;
	    
	    @Column(name="S_CAT")
	    private String sCategorie; 
	    
	    @Column(name="TH1")
	    private String th1;   
	    
	    @Column(name="INDDIFF1")
	    private String inddiff1;  
	    
	    @Column(name="TH2")
	    private String th2;   
	    @Column(name="INDDIFF2")
	    private String inddiff2; 
	    
	    @Column(name="TH3")
	    private String th3;   
	    @Column(name="INDDIFF3")
	    private String inddiff3; 
	    
	    @Column(name="TH4")
	    private String th4;   
	    @Column(name="INDDIFF4")
	    private String inddiff4; 
	    
	    @Column(name="TH5")
	    private String th5;   
	    @Column(name="INDDIFF5")
	    private String inddiff5; 
	    
	    @Column(name="TH6")
	    private String th6;   
	    @Column(name="INDDIFF6")
	    private String inddiff6; 
	    
	    @Column(name="TH7")
	    private String th7;   
	    @Column(name="INDDIFF7")
	    private String inddiff7; 
	    
	    @Column(name="TH8")
	    private String th8;   
	    @Column(name="INDDIFF8")
	    private String inddiff8; 
	    
	    @Column(name="TH9")
	    private String th9;   
	    @Column(name="INDDIFF9")
	    private String inddiff9; 
	    
	    @Column(name="TH10")
	    private String th10;   
	    @Column(name="INDDIFF10")
	    private String inddiff10;
	    
	    @Column(name="TH11")
	    private String th11;   
	    @Column(name="INDDIFF11")
	    private String inddiff11;
	    
	    @Column(name="TH12")
	    private String th12;   
	    @Column(name="INDDIFF12")
	    private String inddiff12;
	    
	    @Column(name="TH13")
	    private String th13;   
	    @Column(name="INDDIFF13")
	    private String inddiff13;
	    
	    @Column(name="TH14")
	    private String th14;   
	    @Column(name="INDDIFF14")
	    private String inddiff14;
	    
	    @Column(name="TH15")
	    private String th15;   
	    @Column(name="INDDIFF15")
	    private String inddiff15;
	    
	    @Column(name="TH16")
	    private String th16;   
	    @Column(name="INDDIFF16")
	    private String inddiff16;
	    
	    @Column(name="TH17")
	    private String th17;   
	    @Column(name="INDDIFF17")
	    private String inddiff17;
	    
	    @Column(name="TH18")
	    private String th18;   
	    @Column(name="INDDIFF18")
	    private String inddiff18;
	    
	    @Column(name="TH19")
	    private String th19;   
	    @Column(name="INDDIFF19")
	    private String inddiff19;
	    
	    @Column(name="TH20")
	    private String th20;   
	    @Column(name="INDDIFF20")
	    private String inddiff20;
	    
	    @Column(name="TH21")
	    private String th21;   
	    @Column(name="INDDIFF21")
	    private String inddiff21;

	    @Column(name="TH22")
	    private String th22;   
	    @Column(name="INDDIFF22")
	    private String inddiff22;
	    
	    @Column(name="TH23")
	    private String th23;   
	    @Column(name="INDDIFF23")
	    private String inddiff23;
	    
	    @Column(name="TH24")
	    private String th24;   
	    @Column(name="INDDIFF24")
	    private String inddiff24;
	    
	    @Column(name="TH25")
	    private String th25;   
	    @Column(name="INDDIFF25")
	    private String inddiff25;
	    
	    @Column(name="TH26")
	    private String th26;   
	    @Column(name="INDDIFF26")
	    private String inddiff26;
	    
	    @Column(name="TH27")
	    private String th27;   
	    @Column(name="INDDIFF27")
	    private String inddiff27;
	    
	    @Column(name="TH28")
	    private String th28;   
	    @Column(name="INDDIFF28")
	    private String inddiff28;
	    
	    @Column(name="TH29")
	    private String th29;   
	    @Column(name="INDDIFF29")
	    private String inddiff29;
	    
	    @Column(name="TH30")
	    private String th30;   
	    @Column(name="INDDIFF30")
	    private String inddiff30;
	    
	    @Column(name="TH31")
	    private String th31;   
	    @Column(name="INDDIFF31")
	    private String inddiff31;
	    
	    @Column(name="TH32")
	    private String th32;   
	    @Column(name="INDDIFF32")
	    private String inddiff32;

	    @Column(name="TH33")
	    private String th33;   
	    @Column(name="INDDIFF33")
	    private String inddiff33;
	    
	    @Column(name="TH34")
	    private String th34;   
	    @Column(name="INDDIFF34")
	    private String inddiff34;
	    
	    @Column(name="TH35")
	    private String th35;   
	    @Column(name="INDDIFF35")
	    private String inddiff35;
	    
	    @Column(name="TH36")
	    private String th36;   
	    @Column(name="INDDIFF36")
	    private String inddiff36;
	    
	    @Column(name="TH37")
	    private String th37;   
	    @Column(name="INDDIFF37")
	    private String inddiff37;
	    
	    @Column(name="TH38")
	    private String th38;   
	    @Column(name="INDDIFF38")
	    private String inddiff38;
	    
	    @Column(name="TH39")
	    private String th39;   
	    @Column(name="INDDIFF39")
	    private String inddiff39;

	    
	    @Column(name="TH40")
	    private String th40;   
	    @Column(name="INDDIFF40")
	    private String inddiff40;
		public Salaire() {
			super();
		}
		public Salaire(Integer id, String categorie, String sCategorie, String th1, String inddiff1, String th2,
				String inddiff2, String th3, String inddiff3, String th4, String inddiff4, String th5, String inddiff5,
				String th6, String inddiff6, String th7, String inddiff7, String th8, String inddiff8, String th9,
				String inddiff9, String th10, String inddiff10, String th11, String inddiff11, String th12,
				String inddiff12, String th13, String inddiff13, String th14, String inddiff14, String th15,
				String inddiff15, String th16, String inddiff16, String th17, String inddiff17, String th18,
				String inddiff18, String th19, String inddiff19, String th20, String inddiff20, String th21,
				String inddiff21, String th22, String inddiff22, String th23, String inddiff23, String th24,
				String inddiff24, String th25, String inddiff25, String th26, String inddiff26, String th27,
				String inddiff27, String th28, String inddiff28, String th29, String inddiff29, String th30,
				String inddiff30, String th31, String inddiff31, String th32, String inddiff32, String th33,
				String inddiff33, String th34, String inddiff34, String th35, String inddiff35, String th36,
				String inddiff36, String th37, String inddiff37, String th38, String inddiff38, String th39,
				String inddiff39, String th40, String inddiff40) {
			super();
			this.id = id;
			this.categorie = categorie;
			this.sCategorie = sCategorie;
			this.th1 = th1;
			this.inddiff1 = inddiff1;
			this.th2 = th2;
			this.inddiff2 = inddiff2;
			this.th3 = th3;
			this.inddiff3 = inddiff3;
			this.th4 = th4;
			this.inddiff4 = inddiff4;
			this.th5 = th5;
			this.inddiff5 = inddiff5;
			this.th6 = th6;
			this.inddiff6 = inddiff6;
			this.th7 = th7;
			this.inddiff7 = inddiff7;
			this.th8 = th8;
			this.inddiff8 = inddiff8;
			this.th9 = th9;
			this.inddiff9 = inddiff9;
			this.th10 = th10;
			this.inddiff10 = inddiff10;
			this.th11 = th11;
			this.inddiff11 = inddiff11;
			this.th12 = th12;
			this.inddiff12 = inddiff12;
			this.th13 = th13;
			this.inddiff13 = inddiff13;
			this.th14 = th14;
			this.inddiff14 = inddiff14;
			this.th15 = th15;
			this.inddiff15 = inddiff15;
			this.th16 = th16;
			this.inddiff16 = inddiff16;
			this.th17 = th17;
			this.inddiff17 = inddiff17;
			this.th18 = th18;
			this.inddiff18 = inddiff18;
			this.th19 = th19;
			this.inddiff19 = inddiff19;
			this.th20 = th20;
			this.inddiff20 = inddiff20;
			this.th21 = th21;
			this.inddiff21 = inddiff21;
			this.th22 = th22;
			this.inddiff22 = inddiff22;
			this.th23 = th23;
			this.inddiff23 = inddiff23;
			this.th24 = th24;
			this.inddiff24 = inddiff24;
			this.th25 = th25;
			this.inddiff25 = inddiff25;
			this.th26 = th26;
			this.inddiff26 = inddiff26;
			this.th27 = th27;
			this.inddiff27 = inddiff27;
			this.th28 = th28;
			this.inddiff28 = inddiff28;
			this.th29 = th29;
			this.inddiff29 = inddiff29;
			this.th30 = th30;
			this.inddiff30 = inddiff30;
			this.th31 = th31;
			this.inddiff31 = inddiff31;
			this.th32 = th32;
			this.inddiff32 = inddiff32;
			this.th33 = th33;
			this.inddiff33 = inddiff33;
			this.th34 = th34;
			this.inddiff34 = inddiff34;
			this.th35 = th35;
			this.inddiff35 = inddiff35;
			this.th36 = th36;
			this.inddiff36 = inddiff36;
			this.th37 = th37;
			this.inddiff37 = inddiff37;
			this.th38 = th38;
			this.inddiff38 = inddiff38;
			this.th39 = th39;
			this.inddiff39 = inddiff39;
			this.th40 = th40;
			this.inddiff40 = inddiff40;
		}
		public Integer getId() {
			return id;
		}
		public String getCategorie() {
			return categorie;
		}
		public String getsCategorie() {
			return sCategorie;
		}
		public String getTh1() {
			return th1;
		}
		public String getInddiff1() {
			return inddiff1;
		}
		public String getTh2() {
			return th2;
		}
		public String getInddiff2() {
			return inddiff2;
		}
		public String getTh3() {
			return th3;
		}
		public String getInddiff3() {
			return inddiff3;
		}
		public String getTh4() {
			return th4;
		}
		public String getInddiff4() {
			return inddiff4;
		}
		public String getTh5() {
			return th5;
		}
		public String getInddiff5() {
			return inddiff5;
		}
		public String getTh6() {
			return th6;
		}
		public String getInddiff6() {
			return inddiff6;
		}
		public String getTh7() {
			return th7;
		}
		public String getInddiff7() {
			return inddiff7;
		}
		public String getTh8() {
			return th8;
		}
		public String getInddiff8() {
			return inddiff8;
		}
		public String getTh9() {
			return th9;
		}
		public String getInddiff9() {
			return inddiff9;
		}
		public String getTh10() {
			return th10;
		}
		public String getInddiff10() {
			return inddiff10;
		}
		public String getTh11() {
			return th11;
		}
		public String getInddiff11() {
			return inddiff11;
		}
		public String getTh12() {
			return th12;
		}
		public String getInddiff12() {
			return inddiff12;
		}
		public String getTh13() {
			return th13;
		}
		public String getInddiff13() {
			return inddiff13;
		}
		public String getTh14() {
			return th14;
		}
		public String getInddiff14() {
			return inddiff14;
		}
		public String getTh15() {
			return th15;
		}
		public String getInddiff15() {
			return inddiff15;
		}
		public String getTh16() {
			return th16;
		}
		public String getInddiff16() {
			return inddiff16;
		}
		public String getTh17() {
			return th17;
		}
		public String getInddiff17() {
			return inddiff17;
		}
		public String getTh18() {
			return th18;
		}
		public String getInddiff18() {
			return inddiff18;
		}
		public String getTh19() {
			return th19;
		}
		public String getInddiff19() {
			return inddiff19;
		}
		public String getTh20() {
			return th20;
		}
		public String getInddiff20() {
			return inddiff20;
		}
		public String getTh21() {
			return th21;
		}
		public String getInddiff21() {
			return inddiff21;
		}
		public String getTh22() {
			return th22;
		}
		public String getInddiff22() {
			return inddiff22;
		}
		public String getTh23() {
			return th23;
		}
		public String getInddiff23() {
			return inddiff23;
		}
		public String getTh24() {
			return th24;
		}
		public String getInddiff24() {
			return inddiff24;
		}
		public String getTh25() {
			return th25;
		}
		public String getInddiff25() {
			return inddiff25;
		}
		public String getTh26() {
			return th26;
		}
		public String getInddiff26() {
			return inddiff26;
		}
		public String getTh27() {
			return th27;
		}
		public String getInddiff27() {
			return inddiff27;
		}
		public String getTh28() {
			return th28;
		}
		public String getInddiff28() {
			return inddiff28;
		}
		public String getTh29() {
			return th29;
		}
		public String getInddiff29() {
			return inddiff29;
		}
		public String getTh30() {
			return th30;
		}
		public String getInddiff30() {
			return inddiff30;
		}
		public String getTh31() {
			return th31;
		}
		public String getInddiff31() {
			return inddiff31;
		}
		public String getTh32() {
			return th32;
		}
		public String getInddiff32() {
			return inddiff32;
		}
		public String getTh33() {
			return th33;
		}
		public String getInddiff33() {
			return inddiff33;
		}
		public String getTh34() {
			return th34;
		}
		public String getInddiff34() {
			return inddiff34;
		}
		public String getTh35() {
			return th35;
		}
		public String getInddiff35() {
			return inddiff35;
		}
		public String getTh36() {
			return th36;
		}
		public String getInddiff36() {
			return inddiff36;
		}
		public String getTh37() {
			return th37;
		}
		public String getInddiff37() {
			return inddiff37;
		}
		public String getTh38() {
			return th38;
		}
		public String getInddiff38() {
			return inddiff38;
		}
		public String getTh39() {
			return th39;
		}
		public String getInddiff39() {
			return inddiff39;
		}
		public String getTh40() {
			return th40;
		}
		public String getInddiff40() {
			return inddiff40;
		}

	    */
	    
}
