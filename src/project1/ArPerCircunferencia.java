package project1;

import java.util.Scanner;

public class ArPerCircunferencia {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la circunferencia");
		radio=entrada.nextInt();
		System.out.println("El area de la circunferencia es: "+AreaCircunferencia(radio));
		System.out.println("El perimetro de la circunferencia es:"+PerimetroCircunferencia(radio));

	}
	public static double AreaCircunferencia(int radio) {
		double pi=3.1416;
		return radio*radio*pi;
	}
	public static double PerimetroCircunferencia(int radio) {
		double pi=3.1416;
		return (radio+radio)*pi;
	}

}
