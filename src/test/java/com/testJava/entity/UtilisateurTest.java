package com.testJava.entity;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import junit.framework.Assert;

public class UtilisateurTest {
	
	Compte c1 = new Compte("18-04-2018", 100);
    Compte c2 = new Compte("18-04-2018", 150);
    Compte c3 = new Compte("18-04-2018", 1000);
    List<Compte> comptes = new ArrayList<Compte>();
	Utilisateur u = new Utilisateur("Tata", "Tata", 43, "boulevard de la gare", "0102030405", comptes);
	
	@Test
	public void soldeToutCompteTest() {
		comptes.add(c1);
		comptes.add(c2);
		comptes.add(c3);
    	
		Assert.assertEquals(1250.0, u.soldeToutComptes());
	}
	
}
