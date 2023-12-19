package project1;

import java.util.Scanner;

public class Funciones {
	
	public static void main(String[]args) {
		Scanner entrada= new Scanner(System.in);
		int radio,lado1,lado2;
		System.out.println("Introduce el radio de la circunferencia");
		radio=entrada.nextInt();
		System.out.println("Introduce los lados del rectangulo");
		lado1=entrada.nextInt();
		lado2=entrada.nextInt();
		areaYPerimetroCincunferencia(radio);
		areaRectangulo(lado1,lado2);
	}

	public static void areaYPerimetroCincunferencia(int radio) {
		System.out.println("El area de la circunferencia es: "+AreaCircunferencia(radio));
		System.out.println("El perimetro de la circunferencia es: "+PerimetroCircunferencia(radio));

	}
	public static double AreaCircunferencia(int radio) {
		double pi=3.1416;
		return radio*radio*pi;
	}
	public static double PerimetroCircunferencia(int radio) {
		double pi=3.1416;
		return (radio+radio)*pi;
	}
	public static void areaRectangulo(int lado1,int lado2) {
		System.out.println("El area de un rectangulo es: "+lado1*lado2);
	}

}
