package com.mastere.dao;


import java.util.List;

import javax.persistence.NoResultException;

import com.mastere.db.HibernateUtil;
import com.mastere.metier.Groupe;
import com.mastere.metier.Utilisateur;

public class UtilisateurDAO {
	
	public static Utilisateur getByMailPassword(final String mail, final String password){
		Utilisateur u = new Utilisateur();
		try {
			u =  (Utilisateur) HibernateUtil.getSession()
					.createQuery("from Utilisateur where mail=? and password=?")
					.setParameter(0, mail)
					.setParameter(1, password).getSingleResult();
		} catch (NoResultException nre) {
			nre.getMessage();
		}
		return u;
	}
	
	public static List<Groupe> getAllGroupe() {
		return HibernateUtil.getSession().createQuery("from Groupe").list();
	}
}
