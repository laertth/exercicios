package br.com.laerth;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		double som = m.soma(m.maior(8, 6), m.maior(5, 9));
		int raiz = 	m.raiz(265);
		System.out.println(raiz);
		System.out.println(Math.sqrt(265));
		System.out.println(som);
		
		
		
	}

}
