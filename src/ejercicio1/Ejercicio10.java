package ejercicio1;
import java.util.Scanner;
public class Ejercicio10 {
	public static double calculoIVA(double p) {
		double IVA ;
		IVA = p * 0.21;
		return IVA;
	}
	public static void main(String[] args) {
		double precio, IVA;
		IVA = calculoIVA(precio);
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto dinero te has gastado?");
		precio = sc.nextDouble();
		System.out.println("Precio sin con IVA " +precio+IVA) ;
		
		
		
		
		
		
	}

}
