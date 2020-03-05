package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	int idFormation;
	
	
	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}


	String theme;
	
	@ManyToOne
	@JoinColumn(name="idLieu")  //lo que qpqrece en la tabla formacion es idLieu como parametro
    private Lieu lieu;   //el objeto lieu es la clave extranjera, y aqui no aparece, aparece en otra tabla.
    
    
    
	public Formation() {
		super();
	}


	public Formation(int id, String theme) {
		super();
		this.idFormation = id;
		this.theme = theme;
	}


	public int getId() {
		return idFormation;
	}


	public void setId(int id) {
		this.idFormation = id;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	@Override
	public String toString() {
		return "Formation [id=" + idFormation + ", theme=" + theme + "]";
	}
	
	

}
