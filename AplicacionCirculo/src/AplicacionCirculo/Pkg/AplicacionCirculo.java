package AplicacionCirculo.Pkg;
import java.util.Scanner;

//ESTE ES EL PROGRAMA PRINCIPAL

public class AplicacionCirculo {
	
	//EJERCICIO CON EL PROFE.

	public AplicacionCirculo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
	
		Circulo miCirculo=new Circulo();
		System.out.println("ingrese el radio del circulo: ");

		miCirculo.setRadio(teclado.nextDouble());
		
		System.out.println(miCirculo.getArea());
		System.out.println(miCirculo);
	}

}
