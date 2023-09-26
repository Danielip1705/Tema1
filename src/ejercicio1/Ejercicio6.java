package ejercicio1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// Indicamos la variable int y los dos numeros que vamos a utilizar
		double num1;
		double num2;
		//Ponemos el scanner para que nos lea el teclado
		Scanner sc = new Scanner(System.in);
		//Imprimimos en la pantalla que numeros vamos a insertar
		System.out.println("¿Que dos numeros quieres calcular?");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		//Ponemos resultado de las operaciones 
		System.out.println("La suma de estos dos numeros es " + (num1+num2));
		System.out.println("La resta de estos dos numeros es " + (num1-num2));
		System.out.println("La multiplicación de estos dos numeros es " + num1*num2);
		System.out.println("La división de estos dos numeros es " + num1/num2);
		
		sc.close();
	}

}
