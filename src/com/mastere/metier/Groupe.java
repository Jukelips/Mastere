package com.mastere.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupe")
public class Groupe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String libelle;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
