package ejercicioGatoPkg;

public class EjercicioGato {
	public EjercicioGato() {
		
	}
	
	public static void main(String[]args) {
		Gato miGato=new Gato();
		miGato.setNombre("Simon");
		
		miGato.maullar();
		miGato.dormir(2);
		miGato.correr("ipiales");
		miGato.comer("carne");
		
		System.out.println("El nombre de mi gato es: " + miGato.getNombre());
		
	}
}
