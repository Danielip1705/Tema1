package ejercicio1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// indicamos la variables año actual y año de nacimiento
		int añoactual;
		int añonacimiento;
		// Creamos un scanner
		Scanner sc = new Scanner(System.in);
		//Instruccines
		System.out.println("¿En que año estamos?");
		añoactual = sc.nextInt();
		System.out.println("¿Y en que año naciste?");
		añonacimiento = sc.nextInt();
		//La variable registra lo que has puesto para hacer una resta y calcular tu edad
		System.out.println("Entonces tienes " + (añoactual - añonacimiento));
		
		sc.close();
		
	}

}
