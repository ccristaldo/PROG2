/*Escriba​ ​ una​ ​ aplicación​ ​ en​ ​ donde​ ​ se​ ​ crean​ ​ los​ ​ objetos​ ​ corcho,​ ​ botella​ ​ y ​ ​ sacacorcho​ ​ y ​ ​ se​ ​ pueda​ ​ sacar​ ​ el
corcho​ ​ de​ ​ la​ ​ botella​ ​ usando​ ​ el​ ​ sacacorchos.*/


package Ej6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Corcho cork = new Corcho("Mendoza", true);
		Botella bottle = new Botella(cork);		
		SacaCorchos corkScrew = new SacaCorchos();
		
		corkScrew.destapar(bottle);
		//falta método limpiar
		
		if (corkScrew.isTieneCorcho()) {
			System.out.println("Hay un corcho en el sacacorchos");
		}else {
			System.out.println("Se puede usar el sacacorchos");
		}
		
		
		//System.out.println(bottle.getCorcho().isEnBotella());
	}

}
