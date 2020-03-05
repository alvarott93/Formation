package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Formation;
import model.Lieu;


public class FormationDao implements IFormationDao{

    SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
    Session session=sessionfactory.openSession();
	
	
	public int ajoutForm(Formation form) {
		session.beginTransaction();
		session.save(form);
		session.getTransaction().commit();
		return 0;
	}

	
	
	public List<Formation> listerForm() {
		List<Formation> list=new ArrayList<Formation>();
        try {
    		session.beginTransaction();
    		String requete="select * from formation";
    		SQLQuery query=session.createSQLQuery(requete);
    		query.addEntity(Formation.class);  //sin esto al recuperar de la lista son objetos y no se puede tratar con ellos
    		list=query.list();
    		return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
        
    	public List<Formation> listerFormparlieu(String ville) {
    		List<Formation> list=new ArrayList<Formation>();
            try {
        		session.beginTransaction();
        		System.out.println("paso la ville a listerformparlieu:"+ville);
        		Query query=session.createQuery("from Formation where lieu.ville = :ville");
        		query.setParameter("ville", ville);
        		list=query.list();
        		System.out.println("saco la lista"+list);
        		return list;
    			
    		} catch (Exception e) {
    			e.printStackTrace();
    			return null;
    		}
             
        
        
	}




}


