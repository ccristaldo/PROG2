/*Escribir​ ​ una​ ​ clase​ ​ Sacacorchos​ ​ que​ ​ contenga​ ​ un​ ​ atributo:
1. tieneCorcho​ ​ que​ ​ indica​ ​ si​ ​ el​ ​ sacacorchos​ ​ ha​ ​ sido​ ​ usado​ ​ previamente
Y​ ​ los​ ​ métodos
1. destapar()​ ​ que​ ​ recibe​ ​ un​ ​ objeto​ ​ botella.​ ​ El​ ​ método​ ​ sirve​ ​ para​ ​ sacar​ ​ el​ ​ corcho​ ​ de​ ​ la​ ​ botella
(cambia​ ​ el​ ​ atributo​ ​ del​ ​ objeto​ ​ corcho​ ​ que​ ​ forma​ ​ parte​ ​ de​ ​ la​ ​ clase​ ​ botella).​ ​ Debe​ ​ imprimir​ ​ un
mensaje​ ​ de​ ​ error​ ​ en​ ​ el​ ​ caso​ ​ en​ ​ que​ ​ la​ ​ botella​ ​ ya​ ​ está​ ​ destapada.​ ​ Antes​ ​ de​ ​ destapar​ ​ una​ ​ botella,
debe​ ​ verificar​ ​ si​ ​ el​ ​ objeto​ ​ Sacacorchos​ ​ ha​ ​ sido​ ​ previamente​ ​ usado​ ​ o ​ ​ no.​ ​ En​ ​ caso​ ​ de​ ​ que​ ​ esté
usado,​ ​ imprima​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ y ​ ​ no​ ​ destape​ ​ la​ ​ botella.
*/
package Ej6;

public class SacaCorchos {
	
	private boolean tieneCorcho;
	
	public SacaCorchos() {
		this.tieneCorcho = false;
		
	}

	public void destapar(Botella botella) {
		if (botella.getCorcho().isEnBotella()) {
			botella.getCorcho().setEnBotella(false);
			this.tieneCorcho = true;
		}else {
			System.out.println("La botella no tiene corcho");
		}
	}

	public boolean isTieneCorcho() {
		return tieneCorcho;
	}

	/*
	 * public void setTieneCorcho(boolean tieneCorcho) { this.tieneCorcho =
	 * tieneCorcho; }
	 */
	
	
	

}
