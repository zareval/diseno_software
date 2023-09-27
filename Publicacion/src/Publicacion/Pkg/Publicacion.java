package Publicacion.Pkg;

class Publicacion {
	private String titulo;
	private float precio;
	
	//CONSTRUCTOR BASE
 	public Publicacion(String titulo, float precio) {
 		this.titulo = titulo;
 		this.precio = precio;
 	}
 
 	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void mostrar() {
     System.out.println("Título: " + titulo);
     System.out.println("Precio: $ " + precio + " Pesos Colombianos");
 }
}