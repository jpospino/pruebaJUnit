package com.prueba.coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanoTest {
	Humano humano = new Humano(1, "juan");

	@Test
	public void test() {
		assertFalse("Hubo un error en la creaci�n ", humano.Greting("buenos d�as").toString().equals("buenos d�as juan"));
	}
	
	
	@Test
	public void testGet() {
		assertFalse("Hubo un error en la creaci�n ", humano.GetId() == 1);
	}
	
}
