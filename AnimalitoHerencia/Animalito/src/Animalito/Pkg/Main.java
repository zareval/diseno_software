package Animalito.Pkg;

public class Main {
	public static void main(String[]args) {
		Animalito myAnimalito = new Animalito("Perro.");
        Mamifero theMamifero = new Mamifero("Gato.");
        Gato myGato = new Gato("Meowwww");
        Perro myPerro = new Perro("Woooooof");

        System.out.println(myAnimalito);
        System.out.println("-------------------------------------------------------------");
        System.out.println(myPerro);
        System.out.println("-------------------------------------------------------------");
        System.out.println(theMamifero);
        System.out.println("-------------------------------------------------------------");
        System.out.println(myGato);
	}
}
