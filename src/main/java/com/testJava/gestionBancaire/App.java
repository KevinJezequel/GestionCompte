package com.testJava.gestionBancaire;

import java.util.ArrayList;
import java.util.List;

import com.testJava.entity.Compte;
import com.testJava.entity.DecouvertException;
import com.testJava.entity.Utilisateur;

public class App {
	
    public static void main( String[] args ) {
//    	Creation compte 1 avec un solde de 100
        Compte c1 = new Compte("18-04-2018", 100);
        System.out.println("Solde = " + c1.getSolde());
        
//      Credit de 50
        c1.credit(50);
        System.out.println("Solde après credit de 50 = " + c1.getSolde());
        
//      Debit de 250 (decouvert non autorisé)
        try {
			c1.debit(250);
		} catch (DecouvertException e) {}
        System.out.println("Solde après debit de 250 (non autorisé) = " + c1.getSolde());
        
    	System.out.println("---------------");
    	
//    	Creation compte 2 avec un solde de 150
        Compte c2 = new Compte("18-04-2018", 150);
        System.out.println("Solde = " + c2.getSolde());
        
//      Credit de 100
        c2.credit(100);
        System.out.println("Solde après credit de 100 = " + c2.getSolde());
        
//      Debit de 150 
        try {
			c2.debit(150);
		} catch (DecouvertException e) {}
        System.out.println("Solde après debit de 150 = " + c2.getSolde());
        
        List<Compte> comptes1 = new ArrayList<Compte>();
    	comptes1.add(c1);
    	comptes1.add(c2);
        
//    	Creation utilisateur 1
    	Utilisateur u1 = new Utilisateur("Toto", "Toto", 25, "rue de Paris", "0102030405", comptes1);
    	System.out.println("---------------");
    	System.out.println(u1.toString());
    	
//    	Creation compte 3, 4, 5
        Compte c3 = new Compte("18-04-2018", 1000);
        Compte c4 = new Compte("18-04-2018", 25000);
        Compte c5 = new Compte("18-04-2018", 300);
        
        List<Compte> comptes2 = new ArrayList<Compte>();
    	comptes2.add(c3);
    	comptes2.add(c4);
    	comptes2.add(c5);
    	
//    	Solde tout comptes utilisateur1
    	System.out.println("Solde tout comptes = " +u1.soldeToutComptes());
    	
//    	Affiche tous les comptes de l'utilisateur1
    	System.out.println("Tous les comptes :");
    	u1.trouverTousCompte();
    	
//    	Creation utilisateur 2
    	Utilisateur u2 = new Utilisateur("Titi", "Titi", 66, "avenue de la paix", "0102030405", comptes2);
    	System.out.println("---------------");
    	System.out.println(u2.toString());
    	
//    	Solde tout comptes utilisateur2
    	System.out.println("Solde tout comptes = " +u2.soldeToutComptes());
        
//    	Affiche tous les comptes de l'utilisateur2
    	System.out.println("Tous les comptes :");
    	u2.trouverTousCompte();
    	
//    	Suppression du compte numero 4
    	comptes2.remove(c4);
    	System.out.println("Tous les comptes après suppression du numéro 4:");
    	u2.trouverTousCompte();
    	
//    	Creation liste utilisateur
    	List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    	utilisateurs.add(u1);
    	utilisateurs.add(u2);

//    	Affiche tous les utilisateurs
    	System.out.println("---------------");
		System.out.println("Tous les utilisateurs =");
		for(Utilisateur u : utilisateurs)
		System.out.println(u.toString());
		
//		Suppression de l'utilisateur 1
		utilisateurs.remove(u1);
		System.out.println("Tous les utilisateurs après suppression du numéro 1 =");
		for(Utilisateur u : utilisateurs)
		System.out.println(u.toString());
    }
}
