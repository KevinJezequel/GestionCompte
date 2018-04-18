package com.testJava.entity;

import java.util.List;

public class Utilisateur {

	private String prénom;
	private String nom;
	private int age;
	private String adresse;
	private String numeroDeTelephone;
	private List<Compte> comptes;
	
	public Utilisateur() {
	}
	
	public Utilisateur(String prénom, String nom, int age, String adresse, String numeroDeTelephone, List<Compte> comptes) {
		this.prénom = prénom;
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.numeroDeTelephone = numeroDeTelephone;
		this.comptes = comptes;
	}
	
	public Double soldeToutComptes() {
    	double soldeTC = 0;
    	for(Compte c : comptes)
    		soldeTC += c.getSolde();
    	return soldeTC;
	}
	
	public void trouverTousCompte() {
		for(Compte c : comptes)
		System.out.println(c.toString());

	}
	
	public String getPrénom() {
		return prénom;
	}
	
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}
	
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Utilisateur [prénom = " + prénom + ", nom = " + nom + ", age = " + age + ", adresse = " + adresse
				+ ", numero de telephone = " + numeroDeTelephone + ", comptes = " + comptes.toString() + "]";
	}
	
}
