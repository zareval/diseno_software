package Shape.Pkg;

public class Rectangle extends Shape {
	
	private double ancho;
	private double largo;
	
	public Rectangle() {
		ancho = 1.0;
		largo = 1.0;	
	}

	public Rectangle(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	public Rectangle(String color, boolean relleno, double ancho, double largo) {
		super(color, relleno);
		this.ancho = ancho;
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getÁrea() {
		double área = this.ancho * this.largo;
		return área;
	}
	
	public double getPerímetro() {
		double perímetro = 2 * (this.ancho + this.largo);
		return perímetro;
	}

	@Override
	public String toString() {
		return "Rectangulo: " + super.toString() + ", Ancho: " + ancho + ", Largo: " + largo;
	}
}

