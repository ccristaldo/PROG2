package Ej3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numerador 1er fracción");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese denominador 1er fracción");
		int den1 = sc.nextInt();
		
		Fraccion fraccion1 = new Fraccion(num1, den1);
		
		
		System.out.println("Ingrese numerador 2da fracción");
		int num2 = sc.nextInt();
		
		System.out.println("Ingrese denominador 2da fracción");
		int den2 = sc.nextInt();
		
		Fraccion fraccion2 = new Fraccion(num2, den2);
		
		System.out.println(fraccion1);
		System.out.println(fraccion2);
		
		Fraccion resultadoMult = multiplicar(fraccion1, fraccion2);
		Fraccion resultadoSuma = sumar(fraccion1, fraccion2);
		
		System.out.println("Producto de las fracciones = " + resultadoMult);
		System.out.println("Suma de las fracciones (sin simplificar) = " + resultadoSuma);
		
		
		
		
		sc.close();
	}
	
	public static Fraccion multiplicar(Fraccion f1, Fraccion f2) {
		
		int rn1 = f1.getDividendo() * f2.getDividendo();
		int dn1 = f1.getDivisor() * f2.getDivisor();
		
		Fraccion fResultadoMult = new Fraccion(rn1,dn1);
		return fResultadoMult;
	}
	
	public static Fraccion sumar(Fraccion f1, Fraccion f2) {
		
		int dc = f1.getDivisor()*f2.getDivisor();
		int rn = ((dc/f1.getDivisor())*f1.getDividendo())+((dc/f2.getDivisor())*f2.getDividendo());
		
		Fraccion fResultadoSuma = new Fraccion(rn,dc);
		
		return fResultadoSuma;
	}


}
