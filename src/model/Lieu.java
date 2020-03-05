package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	@Id
	@GeneratedValue
	private int idLieu;
	private String adresse;
	private String ville;
	
       
	@OneToMany(mappedBy = "lieu")   //para decir que la cle etrangere ya existe, cuando hemos hecho join column
	List<Formation> formations;
	
	
	
	public Lieu() {
		super();
	}


	public Lieu(String adresse, String ville) {
		super();
		this.adresse = adresse;
		this.ville = ville;
	}


	public int getIdLieu() {
		return idLieu;
	}


	public void setIdLieu(int id) {
		this.idLieu = id;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", addresse=" + adresse + ", ville=" + ville + "]";
	}
	
	
	

}
