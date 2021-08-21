/*Escribir​ ​ una​ ​ clase​ ​ Papel​ ​ que​ ​ contenga​ ​ un​ ​ atributo​ ​ texto,​ ​ un​ ​ método​ ​ escribir,​ ​ que​ ​ reciba​ ​ una​ ​ cadena​ ​ de
caracteres​ ​ para​ ​ agregar​ ​ al​ ​ texto,​ ​ y ​ ​ el​ ​ método​ ​ toString()​ ​ que​ ​ imprima​ ​ el​ ​ contenido​ ​ del​ ​ texto.
Escribir​ ​ una​ ​ clase​ ​ Birome​ ​ que​ ​ contenga​ ​ un​ ​ atributo​ ​ cantidad​ ​ de​ ​ tinta,​ ​ y ​ ​ un​ ​ método​ ​ escribir,​ ​ que​ ​ reciba​ ​ un
texto​ ​ y ​ ​ un​ ​ papel​ ​ (objeto​ ​ de​ ​ la​ ​ clase​ ​ Papel)​ ​ sobre​ ​ el​ ​ cual​ ​ escribir.​ ​ Cada​ ​ letra​ ​ escrita​ ​ debe​ ​ reducir​ ​ la
cantidad​ ​ de​ ​ tinta​ ​ contenida.​ ​ Cuando​ ​ la​ ​ tinta​ ​ se​ ​ acabe,​ ​ debe​ ​ imprimir​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ indicando​ ​ que
la​ ​ tinta​ ​ se​ ​ ha​ ​ acabado.*/



package Ej5;

public class papel {
	
	private String texto;

	public papel() {
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void escribir(String entrada) {
		
		this.texto = entrada;
		 
	}

	@Override
	public String toString() {
		return "[texto: " + texto + "]";
	}
	
	
	

}
