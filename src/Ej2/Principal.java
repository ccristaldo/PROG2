package Ej2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		libro biblioteca[] = new libro[2];
		
		for (int i = 0; i < 2; i++) {		
		
		
			System.out.println("Ingrese ISBN: ");
			long isbn = sc.nextLong();
			
			sc.nextLine();
			
			System.out.println("Ingrese Título: ");
			String tit = sc.nextLine();
			
			System.out.println("Ingrese Autor: ");
			String aut = sc.nextLine();
			
			System.out.println("Ingrese Cantidad de páginas: ");
			int pag = sc.nextInt();
			
			
			
			biblioteca[i] = new libro(isbn, tit, aut, pag);
		
		}
		
		//libro libro1 = new libro(123456789, "Moby Dick", "Herman Melville", 823);
		//libro libro2 = new libro(987654321, "Das Kapital", "Karl Marx", 551);
		
		System.out.println(biblioteca[0]);
		System.out.println(biblioteca[1]);
		
		if (biblioteca[0].getCantPag()>biblioteca[1].getCantPag()) {
			System.out.println(biblioteca[0].getTitulo() + " tiene más páginas que " + biblioteca[1].getTitulo());
		}else {
			System.out.println(biblioteca[1].getTitulo() + " tiene más páginas que " + biblioteca[0].getTitulo());
		}
		sc.close();
		
	}

}
