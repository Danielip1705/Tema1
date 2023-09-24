package ejercicio1;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int peseta;
		System.out.println("Dime cuantas pesetas quieres pasar a euros");
		peseta = sc.nextInt();
		System.out.println( + Math.round(peseta /166.386) + " Euro = " + peseta );
		int euro;
		System.out.println("Cuantos euros quieres pasar a pesetas");
		euro = sc.nextInt();
		System.out.println( +euro+ " euro = " + Math.round(euro *166.386) );
		
		sc.close();
	}

}
