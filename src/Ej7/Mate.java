/*Crear​ ​ una​ ​ clase​ ​ Mate​ ​ que​ ​ describa​ ​ el​ ​ funcionamiento​ ​ de​ ​ la​ ​ conocida​ ​ bebida​ ​ tradicional​ ​ local.​ ​ La​ ​ clase
debe​ ​ contener​ ​ como​ ​ miembros:
1. Un​ ​ atributo​ ​ para​ ​ la​ ​ cantidad​ ​ de​ ​ cebadas​ ​ restantes​ ​ hasta​ ​ que​ ​ se​ ​ lava​ ​ el​ ​ mate​ ​ (representada​ ​ por
un​ ​ número).
2. Un​ ​ atributo​ ​ para​ ​ el​ ​ estado​ ​ (lleno​ ​ o ​ ​ vacío).
3. El​ ​ constructor​ ​ debe​ ​ recibir​ ​ como​ ​ parámetro​ ​ n,​ ​ la​ ​ cantidad​ ​ máxima​ ​ de​ ​ cebadas​ ​ en​ ​ base​ ​ a ​ ​ la
cantidad​ ​ de​ ​ yerba​ ​ vertida​ ​ en​ ​ el​ ​ recipiente.
4. Un​ ​ método​ ​ cebar(),​ ​ que​ ​ llena​ ​ el​ ​ mate​ ​ con​ ​ agua.​ ​ Si​ ​ se​ ​ intenta​ ​ cebar​ ​ con​ ​ el​ ​ mate​ ​ lleno,​ ​ se​ ​ debe
imprimir​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ 'Cuidado!​ ​ Te​ ​ quemaste!'
5. Un​ ​ método​ ​ beber(),​ ​ que​ ​ vacía​ ​ el​ ​ mate​ ​ y ​ ​ le​ ​ resta​ ​ una​ ​ cebada​ ​ disponible.​ ​ Si​ ​ se​ ​ intenta​ ​ beber​ ​ un
mate​ ​ vacío,​ ​ se​ ​ debe​ ​ imprimir​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ 'El​ ​ mate​ ​ está​ ​ vacío​ ​ !'
6. Es​ ​ posible​ ​ seguir​ ​ cebando​ ​ y ​ ​ bebiendo​ ​ el​ ​ mate​ ​ aunque​ ​ no​ ​ haya​ ​ cebadas​ ​ disponibles.​ ​ En​ ​ ese
caso​ ​ la​ ​ cantidad​ ​ de​ ​ cebadas​ ​ restantes​ ​ se​ ​ mantendrá​ ​ en​ ​ 0,​ ​ y ​ ​ cada​ ​ vez​ ​ que​ ​ se​ ​ intente​ ​ beber​ ​ se
debe​ ​ imprimir​ ​ un​ ​ mensaje​ ​ de​ ​ aviso:​ ​ 'Advertencia:​ ​ el​ ​ mate​ ​ está​ ​ lavado.'.
Crear​ ​ una​ ​ aplicación​ ​ en​ ​ donde​ ​ se​ ​ cree​ ​ un​ ​ objeto​ ​ Mate​ ​ y ​ ​ se​ ​ puedan​ ​ tomar​ ​ mates.*/

package Ej7;

public class Mate {
	
	private int cebadasRestantes;
	private boolean estado = false;
	
	public Mate(int cebadasRestantes) {
		super();
		this.cebadasRestantes = cebadasRestantes;
	}

	public int getCebadasRestantes() {
		return cebadasRestantes;
	}

	public void setCebadasRestantes(int cebadasRestantes) {
		this.cebadasRestantes = cebadasRestantes;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void cebar() {
		if (this.estado == true) {
			System.out.println("'Cuidado!​ ​ Te​ ​ quemaste!'");
		}else {
			this.estado = true;
		}
		
	}
	
	public void beber() {
		if (this.estado==true) {
			this.estado=false;
			if (this.cebadasRestantes > 0) {
				this.cebadasRestantes -=1;
			}else {
				this.cebadasRestantes=0;
				System.out.println("Advertencia:​ ​ el​ ​ mate​ ​ está​ ​ lavado.");
			}
		}else {
			System.out.println("El​ ​ mate​ ​ está​ ​ vacío​ ​ !");
		}
	}
	
	

}
