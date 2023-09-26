package ejercicio1;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		//Indicamos double ya que el precio puede llevar decimales
		double precio;
		
		//indicamos la variable double ya que va a llevar decimales
		double precioFinal;
		
		//Indicamos que la constante IVA es igual a 21
		final int IVA = 21;
		
		//Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el dinero que ha gastado
		System.out.println("¿Cuanto dinero te has gastado?");
		
		//Declaramos el precio que ha gastado
		precio = sc.nextDouble();
		
		//Indicamos el calculo de el precio y el IVA en la variable precioFinal
		precioFinal = precio*IVA/100 + precio;
		
		//Imprimimos la respuesta con la variable que tiene los calculos
		System.out.println("Precio con IVA incluido " + precioFinal) ;
		sc.close();
		
		
		
		
		
	}

}
