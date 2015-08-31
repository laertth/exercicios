package br.com.POO;

public class Carrotest {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		
		ferrari.modelo = "Ferrari r854";
		ferrari.velocidademax = 300;
		ferrari.segzerocem = 3.5;
		
		System.out.println(ferrari.modelo);
		System.out.println(ferrari.velocidademax);
		System.out.println(ferrari.segzerocem);

	}

}
