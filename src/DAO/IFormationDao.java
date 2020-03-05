package DAO;

import java.util.ArrayList;
import java.util.List;

import model.Formation;
import model.Lieu;

public interface IFormationDao {
	
	public int ajoutForm(Formation form);
	public List<Formation> listerForm();
	public List<Formation> listerFormparlieu(String ville);

}
