package br.com.heranca;

public class Animal {
	double peso;
	String comida;

	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("Dormir");
	}

	void fazerbarulho() {
		System.out.println("Fazer Barulho");
	}

}
