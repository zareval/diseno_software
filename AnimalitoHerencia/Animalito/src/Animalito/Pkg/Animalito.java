package Animalito.Pkg;

public class Animalito {
	private String nombre;
	
	public Animalito(String name) {
		this.nombre=name;
	}

	@Override
	public String toString() {
		return "Animalito: Nombre: " + nombre;		
	}
	
	
}
