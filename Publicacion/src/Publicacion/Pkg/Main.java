package Publicacion.Pkg;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad (Edición Especial)", 70000, 436, 1967);
        
        Disco disco = new Disco("Thriller", 93323.3f , 42.19f);
        
        System.out.println("Información del Libro:");
        libro.mostrar();
        
        System.out.println("\nInformación del Disco:");
        disco.mostrar();
    }
}
