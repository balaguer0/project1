package project1;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int lado1,lado2;
		System.out.println("Introduce el lado 1");
		lado1=entrada.nextInt();
		System.out.println("Introduce el lado 2");
		lado2=entrada.nextInt();
		System.out.println("El area de un rectangulo es: "+lado1*lado2);

	}

}
