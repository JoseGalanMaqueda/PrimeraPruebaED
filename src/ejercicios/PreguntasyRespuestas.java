package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreguntasyRespuestas {
	
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException {
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.readLine();
		System.out.println("¿Cuántos años tienes?");
		String anos = teclado.readLine();
		System.out.println("¿En qué curso estás?");
		String curso = teclado.readLine();
		mensaje(nombre, anos, curso);
	}
 
	public static void mensaje(String nombre, String anos, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + anos + " años y estás en " + curso);
	}
}
