/*Crea​ ​ una​ ​ clase​ ​ llamada​ ​ Cuenta​ ​ que​ ​ tendrá​ ​ los​ ​ siguientes​ ​ atributos:
1. titular​ ​ y ​ ​ cantidad​ ​ (puede​ ​ tener​ ​ decimales).​ ​ Crear​ ​ sus​ ​ métodos​ ​ get,​ ​ set.
2. Crear​ ​ dos​ ​ constructores​ ​ que​ ​ permitan​ ​ crear​ ​ una​ ​ cuenta​ ​ para​ ​ un​ ​ titular​ ​ y ​ ​ la​ ​ cantidad.
Tendrá​ ​ dos​ ​ métodos​ ​ especiales:
1. ingresar(double​ ​ cantidad):​ ​ se​ ​ ingresa​ ​ una​ ​ cantidad​ ​ a ​ ​ la​ ​ cuenta,​ ​ si​ ​ la​ ​ cantidad​ ​ introducida​ ​ es
negativa,​ ​ no​ ​ se​ ​ hará​ ​ nada.
2. retirar(double​ ​ cantidad):​ ​ se​ ​ retira​ ​ una​ ​ cantidad​ ​ a ​ ​ la​ ​ cuenta,​ ​ si​ ​ restando​ ​ la​ ​ cantidad​ ​ actual​ ​ a ​ ​ la​ ​ que
nos​ ​ pasan​ ​ es​ ​ negativa,​ ​ la​ ​ cantidad​ ​ de​ ​ la​ ​ cuenta​ ​ pasa​ ​ a ​ ​ ser​ ​ 0.*/

package Ej1;

public class cuenta {
	private String titular;
	private double cantidad;
	
	public cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double ingresar(double cantidad) {
		if (cantidad >= 0) {
			this.cantidad += cantidad;
		}else {
			System.out.println("Error. Ingresó un valor negativo");
		}
		return cantidad;
		
	}
	
	public double retirar(double monto) {
		double verificar = this.cantidad - monto;
		if (verificar <= 0) {
			this.cantidad = 0;
		}else {
			this.cantidad -= monto;
		}
		return monto;
	}

	@Override
	public String toString() {
		return "cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	

}
