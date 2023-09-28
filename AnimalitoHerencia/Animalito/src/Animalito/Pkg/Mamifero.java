package Animalito.Pkg;

public class Mamifero extends Animalito{

	public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Mamifero: Animal: Nombre: " + super.toString();
    }
}