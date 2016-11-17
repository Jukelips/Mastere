package com.mastere.dao;


import java.util.List;

import com.mastere.db.HibernateUtil;
import com.mastere.metier.Utilisateur;

public class UtilisateurDAO {
	
	public static Utilisateur getByMailPassword(final String mail, final String password){
		Utilisateur u =  (Utilisateur) HibernateUtil.getSession()
				.createQuery("from Utilisateur where mail=?mail and password=?pass")
				.setParameter(1, mail)
				.setParameter(2, password).getSingleResult();//uniqueResult();
/*		List<Utilisateur> result = (List<Utilisateur>)  HibernateUtil.getSession()
				.createQuery("from Utilisateur where mail=?mail and password=?pass").list();
		Utilisateur toto = (Utilisateur) HibernateUtil.getSession()
				.createQuery("from Utilisateur where mail=?mail and password=?pass").list();*/
		return u;
	}
}
