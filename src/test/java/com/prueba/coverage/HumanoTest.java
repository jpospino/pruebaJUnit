package com.prueba.coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanoTest {
	Humano humano = new Humano(1, "juan");

	@Test
	public void test() {
		assertFalse("Hubo un error en la creación ", humano.Greting("buenos días").toString().equals("buenos días juan"));
	}
	
	
	@Test
	public void testGet() {
		assertFalse("Hubo un error en la creación ", humano.GetId() == 1);
	}
	
}
