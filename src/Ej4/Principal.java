package Ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> vectorPrueba = new ArrayList<Integer>();
		
		String continuar = "s";
		
		
		System.out.println("Ingrese x: ");
		int x = sc.nextInt();
		
		System.out.println("Ingrese y: ");
		int y = sc.nextInt();
		
		System.out.println("Ingrese z: ");
		int z = sc.nextInt();
		
		System.out.println("Ingrese escalar: ");
		int escalar = sc.nextInt();
		
		Vector vector1 = new Vector(x,y,z);
			
		System.out.println("Producto del Vector por el escalar: " + prodEscalar(vector1, escalar));
		
		while (continuar.equals("s")) {
			System.out.println("Ingrese numero: ");
			int num = sc.nextInt();
			sc.nextLine();
			vectorPrueba.add(num);
			System.out.println("Continuar(s/n): ");
			continuar = sc.next();		
		}
		
		System.out.println(vectorPrueba.size());
		if (vectorPrueba.size() == 3) {
			Vector vector2 = new Vector(vectorPrueba.get(0), vectorPrueba.get(1), vectorPrueba.get(2));
			System.out.println("Suma de Vectores: " + sumaVectores(vector1, vector2));
		}else {
			System.out.println("Los vectores tienen distintas dimensiones. No se pueden sumar.");
		}
		sc.close();
	}
	
	public static Vector prodEscalar(Vector v, int escalar) {
		
		Vector resultado = new Vector(v.getX()*escalar, v.getY()*escalar, v.getZ()*escalar);
		
		return resultado;
	}
	
	public static Vector sumaVectores(Vector v1, Vector v2) {
		
		Vector resultadoSuma = new Vector(v1.getX()+v2.getX(), v1.getY()+v2.getY(),v1.getZ()+v2.getZ());
		
		return resultadoSuma;
	}

}
