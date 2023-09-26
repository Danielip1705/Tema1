package ejercicio1;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Que area quieres calcular");
		//Introducimos un numero para que sea el area
		radio = sc.nextFloat();
		//ponemos la variable double ya que tendra decimal
		//Ponemos la formula matematica de la circunferencia en cada identificador
	    double area = 2* Math.PI *radio;
		double longitud = Math.pow(radio, 2);
		//Imprimimos la solución del número que hemos puesto como radio
		System.out.println("El area seria " + area);
		
		System.out.println("Y su longitud es " + longitud);
		//cerramos el scanner
	sc.close();
	}

}
