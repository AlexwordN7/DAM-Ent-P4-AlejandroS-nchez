package main.java.liceosorollab;

public class Rectangulo {
	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1, int lado2) {
		this.lado1=lado1;
		this.lado2=lado2;
	}
	
	public int getlado1() {
		return this.lado1;
	}
	public void setlado1() {
		this.lado1=lado1;
	}
	
	public int getlado2() {
		return this.lado2;
	}
	public void setlado2() {
		this.lado2=lado2;
	}
	
	public boolean comprobarLadosIguales() {
		boolean iguales=false;
		 if (lado1==lado2) {
			iguales=true;
		 }
		return iguales;
	}
	
	public int comproPerimetro() {
		int total=0;
		total=2*(this.lado1+this.lado2);
		return total;
	}
	
	public int comproArea() {
		int area = this.lado1* this.lado2;
		System.out.println("El area es: " + area);
		return area;
	}
	
	public int comproTamano() {
		int diagonal=(int )Math.sqrt(Math.pow(this.lado1, 2)+(Math.pow(this.lado2, 2)));
		return diagonal;
	}
}
