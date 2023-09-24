package ejercicio1;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		System.out.println("¿Me darias el honor de saber su nombre y edad?");
		nombre = sc.next();
		edad = sc.nextInt();
		String rojo = "\033[31m";
		String b = "\u001B[0m";
		if (edad>=18)
		{
			System.out.println("Hola " +rojo+nombre +b+",tienes " +rojo+edad+b + ". ¡Que mayor eres!");
		}
			else
				System.out.println("Hola " +rojo+nombre+b+ ",tienes " +rojo+edad+b + ". ¡Que joven eres!" );
		sc.close();
	}
	
}
