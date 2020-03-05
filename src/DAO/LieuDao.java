package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Lieu;



public class LieuDao implements ILieuDao{
      
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
    Session session=sessionfactory.openSession();
	
	public int ajoutLieu(Lieu lieu) {
		session.beginTransaction();
		session.saveOrUpdate(lieu);
		session.getTransaction().commit();
		return 0;
	}

	
	public List<Lieu> listeLieu() {
		List<Lieu> list= new ArrayList<Lieu>();
		try {
			session.beginTransaction();
			String requete="select * from lieu";
			SQLQuery query=session.createSQLQuery(requete);
			query.addEntity(Lieu.class);
			list=query.list();
			System.out.println("liste de lieus lieudao");
			System.out.println(list);
			return list;
		} 
		catch (Exception e) {
			return null;		
		}
	}
}
	
	


