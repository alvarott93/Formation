package DAO;

import java.util.List;

import model.Lieu;

public interface ILieuDao {
	
	public int ajoutLieu(Lieu lieu);
	public List<Lieu> listeLieu();

}
