package com.manel.medicament.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class medicament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String barCode;
	private long prix;
	private long qteS;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public long getQteS() {
		return qteS;
	}
	public void setQteS(long qteS) {
		this.qteS = qteS;
	}
	@Override
	public String toString() {
		return "medicament [id=" + id + ", nom=" + nom + ", barCode=" + barCode + ", prix=" + prix + ", qteS=" + qteS
				+ "]";
	}
	public medicament(String nom, String barCode, long prix, long qteS) {
		super();
		this.nom = nom;
		this.barCode = barCode;
		this.prix = prix;
		this.qteS = qteS;
	}
	public medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
