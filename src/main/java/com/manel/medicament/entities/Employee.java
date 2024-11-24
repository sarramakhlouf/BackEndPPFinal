package com.manel.medicament.entities;

import java.util.Date; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String emailEmploye;
	private String fullNameEmploye;
	@Temporal(TemporalType.DATE)
	private Date dateNaissanceEmploye;
	private int numTelEmploye;
	
	public Employee() {
		super();
	}

	public Employee(String emailEmploye, String fullNameEmploye, Date dateNaissanceEmploye, int numTelEmploye) {
		super();
		this.emailEmploye = emailEmploye;
		this.fullNameEmploye = fullNameEmploye;
		this.dateNaissanceEmploye = dateNaissanceEmploye;
		this.numTelEmploye = numTelEmploye;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getEmailEmploye() {
		return emailEmploye;
	}

	public void setEmailEmploye(String emailEmploye) {
		this.emailEmploye = emailEmploye;
	}

	public String getFullNameEmploye() {
		return fullNameEmploye;
	}

	public void setFullNameEmploye(String fullNameEmploye) {
		this.fullNameEmploye = fullNameEmploye;
	}

	public Date getDateNaissanceEmploye() {
		return dateNaissanceEmploye;
	}

	public void setDateNaissanceEmploye(Date dateNaissanceEmploye) {
		this.dateNaissanceEmploye = dateNaissanceEmploye;
	}

	public int getNumTelEmploye() {
		return numTelEmploye;
	}

	public void setNumTelEmploye(int numTelEmploye) {
		this.numTelEmploye = numTelEmploye;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", emailEmploye=" + emailEmploye + ", FullNameEmploye="
				+ fullNameEmploye + ", dateNaissanceEmploye=" + dateNaissanceEmploye + ", NumTelEmploye="
				+ numTelEmploye + "]";
	} 
}