package main.java.liceosorollab;

public class Numero {
	
	private int numero1;
	private int numero2;
	
	public Numero(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public boolean numero1() {
		boolean correcto = true;
		if(this.numero1 == this.numero1) {
			correcto = true;
		}
		return correcto;
	}
	
	public boolean numero2() {
		boolean correcto = true;
		if(this.numero2 == this.numero2) {
			correcto = true;
		}
		return correcto;
	}
	
	public int suma() {
		int resultado;
		resultado = this.numero1 + this.numero2;
		return resultado;
	}
	
	public int resta() {
		int resultado;
		resultado = this.numero1 - this.numero2;
		return resultado;
	}
	
	public int multiplicar() {
		int resultado;
		resultado = this.numero1 * this.numero2;
		return resultado;
	}
	
	public int dividir() {
		int resultado;
		resultado = this.numero1 / this.numero2;
		return resultado;
	}
	
	public int potencia() {
		int resultado;
		resultado = (int) Math.pow(this.numero1,this.numero2);
		return resultado;
	}

}
