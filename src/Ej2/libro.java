/*Crear​ ​ una​ ​ clase​ ​ Libro​ ​ que​ ​ contenga​ ​ los​ ​ siguientes​ ​ atributos:
1. ISBN,​ ​ Título,​ ​ Autor,​ ​ Número​ ​ de​ ​ páginas
Crear​ ​ sus​ ​ respectivos​ ​ métodos​ ​ get​ ​ y ​ ​ set​ ​ correspondientes​ ​ para​ ​ cada​ ​ atributo.​ ​ Crear​ ​ el​ ​ método​ ​ toString()
para​ ​ mostrar​ ​ la​ ​ información​ ​ relativa​ ​ al​ ​ libro​ ​ con​ ​ el​ ​ siguiente​ ​ formato:
“El​ ​ libro​ ​ con​ ​ ISBN​ ​ creado​ ​ por​ ​ el​ ​ autor​ ​ tiene​ ​ páginas”
Crear​ ​ una​ ​ aplicación​ ​ que​ ​ permita​ ​ crear​ ​ 2 ​ ​ objetos​ ​ Libro​ ​ (los​ ​ valores​ ​ que​ ​ se​ ​ quieran)​ ​ y ​ ​ mostrarlos​ ​ por
pantalla.​ ​ Por​ ​ último,​ ​ indicar​ ​ cuál​ ​ de​ ​ los​ ​ 2 ​ ​ tiene​ ​ más​ ​ páginas.*/

package Ej2;

public class libro {
	
	private long ISBN;
	private String titulo;
	private String autor;
	private int cantPag;
	
	public libro(long iSBN, String titulo, String autor, int cantPag) {
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.cantPag = cantPag;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantPag() {
		return cantPag;
	}

	public void setCantPag(int cantPag) {
		this.cantPag = cantPag;
	}

	@Override
	public String toString() {
		//“El​ ​ libro​ ​ con​ ​ ISBN​ ​ creado​ ​ por​ ​ el​ ​ autor​ ​ tiene​ ​ páginas”
		return "El libro con ISBN = " + ISBN + " creado por el autor: " + autor + " tiene páginas = " + cantPag;
	}
	
	
	
	

}
