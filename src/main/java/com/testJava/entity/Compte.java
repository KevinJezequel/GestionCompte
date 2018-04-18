package com.testJava.entity;


public class Compte {

	private int numeroCompte;
	private String dateCreation;
	private double solde;
	static int nombreCompte;

	public Compte() {
	}

	public Compte(String dateCreation, double solde) {
		this.dateCreation = dateCreation;
		this.solde = solde;
		++nombreCompte;
		numeroCompte=nombreCompte;
	}
	
	public double credit(double somme) {
		return solde += somme;
	}
	
	
	public double debit(double somme) throws DecouvertException {
		if (somme>solde) throw new DecouvertException();
		else {	
			solde -= somme;
		}
		return solde;
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}
	
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	public String getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNombreCompte() {
		return nombreCompte;
	}

	@SuppressWarnings("static-access")
	public void setNombreCompte(int nombreCompte) {
		this.nombreCompte = nombreCompte;
	}

	@Override
	public String toString() {
		return "Compte [numero de compte = " + numeroCompte + ", date de creation = " + dateCreation + ", solde = " + solde + "]";
	}
	
}
