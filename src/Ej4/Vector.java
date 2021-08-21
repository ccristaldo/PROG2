/*Crear​ ​ una​ ​ clase​ ​ Vector,​ ​ que​ ​ en​ ​ su​ ​ constructor​ ​ reciba​ ​ una​ ​ lista​ ​ de​ ​ elementos​ ​ que​ ​ serán​ ​ sus​ ​ coordenadas.
En​ ​ el​ ​ método​ ​ toString()​ ​ se​ ​ imprime​ ​ su​ ​ contenido​ ​ con​ ​ el​ ​ formato​ ​ [x,y,z].
1. Crear​ ​ un​ ​ método​ ​ que​ ​ reciba​ ​ un​ ​ número​ ​ y ​ ​ devuelva​ ​ un​ ​ nuevo​ ​ vector​ ​ (objeto​ ​ de​ ​ la​ ​ clase​ ​ Vector),
con​ ​ los​ ​ elementos​ ​ multiplicados​ ​ por​ ​ ese​ ​ número.
2. Crear​ ​ un​ ​ método​ ​ sumar​ ​ que​ ​ recibe​ ​ otro​ ​ vector,​ ​ verifica​ ​ si​ ​ tienen​ ​ la​ ​ misma​ ​ cantidad​ ​ de​ ​ elementos
y​ ​ devuelve​ ​ un​ ​ nuevo​ ​ vector​ ​ con​ ​ la​ ​ suma​ ​ de​ ​ ambos.​ ​ Si​ ​ no​ ​ tienen​ ​ la​ ​ misma​ ​ cantidad​ ​ de​ ​ elementos
entonces​ ​ imprimir​ ​ un​ ​ mensaje​ ​ de​ ​ error​ ​ y ​ ​ la​ ​ función​ ​ debe​ ​ retornar​ ​ el​ ​ vector​ ​ que​ ​ se​ ​ pasó​ ​ como
parámetro.
*/

package Ej4;

public class Vector {
	
	private int x;
	private int y;
	private int z;
	
	public Vector(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector [" + x + ", " + y + ", " + z + "]";
	}
	
	

}
