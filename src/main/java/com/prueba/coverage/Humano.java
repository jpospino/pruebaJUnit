package com.prueba.coverage;

public class Humano {
	private int id;
	private String name;
	
	
	
	public Humano(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int GetId() {
		return this.id;
	}
	
	public String Greting(String saludo) {
		return saludo + " " + name + ".";
	}
}
