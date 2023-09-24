package ejercicio1;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String calle;
		int numtef;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre = sc.next();
		System.out.println("Dime tu calle");
		calle = sc.next();
		System.out.println("Dime tu numero de telefono");
		numtef = sc.nextInt();
		String rojo = "\033[31m";
		String b = "\u001B[0m";
		System.out.println("Nombre: " + rojo + nombre + b );
		System.out.println("Calle: " + rojo + calle + b );
		System.out.println("Numero de telefono: " + rojo + numtef + b);
		sc.close();

		
	}

}
