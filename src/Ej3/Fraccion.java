/*Crear​ ​ una​ ​ clase​ ​ Fracción,​ ​ que​ ​ cuente​ ​ con​ ​ dos​ ​ atributos:​ ​ dividendo​ ​ y ​ ​ divisor,​ ​ que​ ​ se​ ​ asignan​ ​ en​ ​ el
constructor,​ ​ y ​ ​ se​ ​ imprimen​ ​ como​ ​ X/Y​ ​ en​ ​ el​ ​ método​ ​ toString().
1. Crear​ ​ un​ ​ método​ ​ sumar​ ​ que​ ​ recibe​ ​ otra​ ​ fracción​ ​ y ​ ​ devuelve​ ​ una​ ​ nueva​ ​ fracción​ ​ con​ ​ la​ ​ suma​ ​ de
ambas.
2. Crear​ ​ un​ ​ método​ ​ multiplicar​ ​ que​ ​ recibe​ ​ otra​ ​ fracción​ ​ y ​ ​ devuelve​ ​ una​ ​ nueva​ ​ fracción​ ​ con​ ​ el
producto​ ​ de​ ​ ambas.*/


package Ej3;

public class Fraccion {
	
	private int dividendo;
	private int divisor;
	
	public Fraccion(int dividendo, int divisor) {
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	@Override
	public String toString() {
		return  dividendo + "/" + divisor;
	}
	
	
	
	
	
}
