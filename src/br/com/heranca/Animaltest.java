package br.com.heranca;

public class Animaltest {

	public static void main(String[] args) {
		
		Cachoro shoyu = new Cachoro();
		Galinha pinto = new Galinha();
		
		shoyu.comida = "Carne";
		shoyu.dormir();
		pinto.dormir();
		
		System.out.println(shoyu instanceof Cachoro);
		System.out.println(shoyu instanceof Animal);

	}

}
