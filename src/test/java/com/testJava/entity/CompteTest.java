package com.testJava.entity;

import org.junit.Test;

import junit.framework.Assert;

public class CompteTest {
	
    Compte c = new Compte("18-04-2018", 10);
	
	@Test
	 public void creditTest() {
		Assert.assertEquals(20.0, c.credit(10));
    }
	
	@Test
	 public void creditTestAvec0() {
		Assert.assertEquals(10.0, c.credit(0));
	}
	
	@Test
	 public void creditTestDecimal() {
		Assert.assertEquals(15.6578, c.credit(5.6578));
	}
	
	@Test
	 public void debitTest() throws DecouvertException {
		Assert.assertEquals(0.0, c.debit(10));
	}
	
	@Test
	 public void debitTestAvec0() throws DecouvertException {
		Assert.assertEquals(10.0, c.debit(0));
	}
	
	@Test
	 public void debitTestAvecDecimal() throws DecouvertException {
		Assert.assertEquals(4.3422, c.debit(5.6578));
	}
	
	@Test
	 public void debitTestFail() throws DecouvertException {
		  try {
			  c.debit(20);
		  }catch(DecouvertException e){
			  }
  }
	
}
