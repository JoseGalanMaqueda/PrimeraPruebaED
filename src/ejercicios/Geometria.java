package ejercicios;

public class Geometria {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		int radio = 13; // radio del círculo;
 
		perimetro(radio);
 
		superficie(radio);
		
	}

	private static void superficie(int radio) {
		double superficie = PI * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}

	private static void perimetro(int radio) {
		double perimetro = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + perimetro);
	}

}
