package main.java.liceosorollab;

public class Animal {
	private String especie;
	private String raza;
	private double peso;
	private int edad;
	private String colorPelo;
	public Animal(String especie, String raza, double peso, int edad, String colorPelo) {
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.colorPelo = colorPelo;
	}
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {

		this.especie = especie;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}