package project1;

import java.util.Scanner;

public class Funciones {
	
	public static void main(String[]args) {
		Scanner entrada= new Scanner(System.in);
		int radio,lado1,lado2,base,altura, altura2,ladoCubo2,alturacubo,ancho, ladocubo1;
		//Triangulo
		System.out.println("Introduce la base y la altura del Triangulo");
		base=entrada.nextInt();
		altura=entrada.nextInt();
		//circunferencia
		System.out.println("Introduce el radio de la circunferencia");
		radio=entrada.nextInt();
		//cilindro
		System.out.println("Introduce la altura del cilindro:");
		altura2=entrada.nextInt();
		//rectangulo
		System.out.println("Introduce los lados del rectangulo");
		lado1=entrada.nextInt();
		lado2=entrada.nextInt();
		//cuadrado
		System.out.println("Introduce el lado la altura y anchura de un cubo");
		ladocubo1=entrada.nextInt();
		alturacubo=entrada.nextInt();
		ancho=entrada.nextInt();
		
		System.out.println("Introduce el lado de la cara de un cuadrado");
		ladoCubo2=entrada.nextInt();
		areaYPerimetroCincunferencia(radio);
		areaRectangulo(lado1,lado2);
		System.out.println("El area del Triangulo es: "+calcularAreaTri(base, altura));
		System.out.println("El area del Cilindro es: "+areacilindro(radio, altura));
		System.out.println("el volumen del cubo es;"+volumencubo(ladocubo1,alturacubo,ancho));
		System.out.println("El area de un cubo es: "+areaCubo(ladoCubo2));
		

	
	
		
	}
	public static double areacilindro(int radio,int altura) {
		double pi=3.1416;
		double areaTotalBases=AreaCircunferencia(radio)*2;
		double areaCurva=2*pi*radio*altura;
		
		return areaTotalBases+areaCurva;
		
	}
	
	public static double calcularAreaTri(int base,int altura) {
		
		return (base*altura)/2;
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
	public static double volumencubo(int ladocubo1, int alturacubo,int ancho){
		return(ladocubo1*alturacubo*ancho);

	}
	
	public static double areaCubo(int lado) {
		return (lado*lado)*6;
	}

}
