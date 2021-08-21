/*Escribir​ ​ una​ ​ clase​ ​ Botella​ ​ que​ ​ contenga​ ​ un​ ​ atributo:
1. corcho​ ​ (user​ ​ la​ ​ clase​ ​ Corcho​ ​ para​ ​ definir​ ​ el​ ​ atributo​ ​ de​ ​ la​ ​ clase)​ ​ con​ ​ una​ ​ referencia​ ​ al​ ​ corcho​ ​ que
la​ ​ tapa​ ​ (objeto​ ​ de​ ​ la​ ​ clase​ ​ Corcho).*/

package Ej6;

public class Botella {
	
	private Corcho corcho;
	
	public Botella(Corcho corcho) {
		this.corcho = corcho;
	}

	public Corcho getCorcho() {
		return corcho;
	}

	public void setCorcho(Corcho corcho) {
		this.corcho = corcho;
	}
	
	

}
