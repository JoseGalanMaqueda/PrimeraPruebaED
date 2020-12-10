package pruebas;

import java.util.Scanner;

public class Refactor {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce valor: ");
		int numero = teclado.nextInt();
		
		teclado.close();
		
		double factorial = 1;
		
		while ( numero != 0 ) {
			factorial = factorial * numero;
			numero--;
		}
		
		System.out.println("El resultado es: "+factorial);
		
	}

}
