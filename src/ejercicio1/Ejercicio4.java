package ejercicio1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Indicamos la variable nota1 nota2 y media
		int nota1;
		int nota2;
		float media;
		// Ponemos el algoritmo Scanner para escribir con el teclado
		Scanner sc = new Scanner(System.in);
		//Instrucciones
		System.out.println("¿Que notas has sacado?");
		nota1 = sc.nextInt();
		nota2 =sc.nextInt();
		//
		media = (float) (nota1+nota2)/2;
		System.out.println("Entonces has sacado un " + media);
		sc.close();
		
	}

}
