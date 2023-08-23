package AplicacionCirculo.Pkg;

public class Circulo {
	
	//Ejercicio con el profesor.
	
	private double radio;

	public Circulo() {
		// TODO Auto-generated constructor stub
		radio = 1.0;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	
	//Asignar el radio
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		double miArea = Math.PI*Math.pow(this.radio,2);
		return miArea;
	}
	
	public double getCircunferencia() {
		double circunferencia = 2*this.radio;
		return circunferencia;
	}
	
	//anotacion
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
}
