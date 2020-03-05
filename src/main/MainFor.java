package main;

import DAO.FormationDao;
import DAO.IFormationDao;
import DAO.ILieuDao;
import DAO.LieuDao;
import model.Formation;
import model.Lieu;
import org.hibernate.SessionFactory;

public class MainFor {
	
	public static void main(String[] args) {
		
		IFormationDao daof= new FormationDao();
		ILieuDao daoL = new LieuDao();
		daoL.ajoutLieu(new Lieu("Montparnasse", "Paris"));
		
		Formation formation = new Formation(3,"Data Base");
		Lieu lieu = new Lieu();
		lieu.setIdLieu(1);
		formation.setLieu(lieu);
		daof.ajoutForm(formation);

		
				
	}

}
