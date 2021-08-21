/*Ejercicio​ ​ 6:
Escribir​ ​ una​ ​ clase​ ​ Corcho,​ ​ que​ ​ contenga​ ​ los​ ​ atributos
1. bodega​ ​ (cadena​ ​ con​ ​ el​ ​ nombre​ ​ de​ ​ la​ ​ bodega)​ ​ y ​ ​ enBotella,​ ​ booleano​ ​ que​ ​ indique​ ​ si​ ​ esta​ ​ puesto​ ​ o
no​ ​ en​ ​ la​ ​ botella.
Escribir​ ​ una​ ​ clase​ ​ Botella​ ​ que​ ​ contenga​ ​ un​ ​ atributo:
1. corcho​ ​ (user​ ​ la​ ​ clase​ ​ Corcho​ ​ para​ ​ definir​ ​ el​ ​ atributo​ ​ de​ ​ la​ ​ clase)​ ​ con​ ​ una​ ​ referencia​ ​ al​ ​ corcho​ ​ que
la​ ​ tapa​ ​ (objeto​ ​ de​ ​ la​ ​ clase​ ​ Corcho).
Escribir​ ​ una​ ​ clase​ ​ Sacacorchos​ ​ que​ ​ contenga​ ​ un​ ​ atributo:
1. tieneCorcho​ ​ que​ ​ indica​ ​ si​ ​ el​ ​ sacacorchos​ ​ ha​ ​ sido​ ​ usado​ ​ previamente
Y​ ​ los​ ​ métodos
1. destapar()​ ​ que​ ​ recibe​ ​ un​ ​ objeto​ ​ botella.​ ​ El​ ​ método​ ​ sirve​ ​ para​ ​ sacar​ ​ el​ ​ corcho​ ​ de​ ​ la​ ​ botella
(cambia​ ​ el​ ​ atributo​ ​ del​ ​ objeto​ ​ corcho​ ​ que​ ​ forma​ ​ parte​ ​ de​ ​ la​ ​ clase​ ​ botella).​ ​ Debe​ ​ imprimir​ ​ un
mensaje​ ​ de​ ​ error​ ​ en​ ​ el​ ​ caso​ ​ en​ ​ que​ ​ la​ ​ botella​ ​ ya​ ​ está​ ​ destapada.​ ​ Antes​ ​ de​ ​ destapar​ ​ una​ ​ botella,
debe​ ​ verificar​ ​ si​ ​ el​ ​ objeto​ ​ Sacacorchos​ ​ ha​ ​ sido​ ​ previamente​ ​ usado​ ​ o ​ ​ no.​ ​ En​ ​ caso​ ​ de​ ​ que​ ​ esté
usado,​ ​ imprima​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ y ​ ​ no​ ​ destape​ ​ la​ ​ botella.
2. limpiar()​ ​ que​ ​ permite​ ​ quitar​ ​ el​ ​ corcho​ ​ del​ ​ sacacorchos​ ​ o ​ ​ en​ ​ caso​ ​ de​ ​ que​ ​ el​ ​ sacacorchos​ ​ no​ ​ tenga
un​ ​ corcho,​ ​ entonces​ ​ imprima​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ indicando​ ​ esto.
Escriba​ ​ una​ ​ aplicación​ ​ en​ ​ donde​ ​ se​ ​ crean​ ​ los​ ​ objetos​ ​ corcho,​ ​ botella​ ​ y ​ ​ sacacorcho​ ​ y ​ ​ se​ ​ pueda​ ​ sacar​ ​ el
corcho​ ​ de​ ​ la​ ​ botella​ ​ usando​ ​ el​ ​ sacacorchos.*/

package Ej6;

public class Corcho {

		private String bodega;
		private boolean enBotella;
		
		public Corcho(String bodega, boolean enBotella) {
			this.bodega = bodega;
			this.enBotella = enBotella;
			
		}

		public String getBodega() {
			return bodega;
		}

		public void setBodega(String bodega) {
			this.bodega = bodega;
		}

		public boolean isEnBotella() {
			return enBotella;
		}

		public void setEnBotella(boolean enBotella) {
			this.enBotella = enBotella;
		}
		
		
}
