package Ej1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cuenta cuenta1 = new cuenta("Juan Fernandez", 1000);
		cuenta cuenta2 = new cuenta("Jose Gomez", 2000);
		
		System.out.println(cuenta1.getTitular());
		
		cuenta1.ingresar(10);
		cuenta2.retirar(2500);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}

}
