package ejercicio1;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		
		//++variable hace que se muestre en la consola el resultado incrementado
		System.out.println("Tendras el año que viene " + ++edad);
		
		sc.close();
	}

}
