package ejercicio1;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Indicamos en la variable int la peseta
		int peseta;
		//Indicamos en la variable int el euro
		int euro;
		//Imprimimos en consola el aviso de cuantas pesetas se van a introducir
		System.out.println("Dime cuantas pesetas quieres pasar a euros");
		
		//Indicamos que peseta se va a poder escribir en la consola
		peseta = sc.nextInt();
		
		//imprimos el resultado pero haciendo los calculos
		System.out.println( + Math.round(peseta /166.386) + " Euro = " + peseta );
		
		//Imprimimos en consola el aviso de cuantos euros se van a introducir
		System.out.println("Cuantos euros quieres pasar a pesetas");
		
		//Indicamos que se va a poder escribir en cosola
		euro = sc.nextInt();
		
		//Imprimimos en consola el resultado y hacemos los calculos
		System.out.println( +euro+ " euro = " + Math.round(euro *166.386) );
		
		//Cerramos el Scanner
		sc.close();
	}

}
