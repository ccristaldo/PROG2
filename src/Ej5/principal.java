package Ej5;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese texto: ");
		String entrada = sc.nextLine();
		
		papel papel1 = new papel();
		
		papel1.escribir(entrada);
		
		System.out.println(papel1);
		
		sc.close();

	}

}
