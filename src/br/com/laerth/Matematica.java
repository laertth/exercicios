package br.com.laerth;

public class Matematica {

	int maior(int um, int dois) {

		if (um > dois) {
			return um;
		} else {
			return dois;

		}
	}

	double soma(double um, double dois) {
		double so = um + dois;
		return so;

	}
	
	int raiz(int numero){
		int raiz = 0, impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}
	
	String romanos(int numero2){
		return null;
		
	}

}
