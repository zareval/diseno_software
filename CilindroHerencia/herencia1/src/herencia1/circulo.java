package herencia1;

public class circulo {
	private double radio;
	private String color;
	
	public circulo() {
		this.radio = 1.0;
		this.color = "Red";
	}
	
	public circulo(double radio) {
		this.radio = radio;
		this.color = "Red";
	}
	
	public circulo(double radio, String color) {
		this.radio = radio;
		this.color = color;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	
	public void imprimirCirculo() {
		System.out.println("Radio: " + radio);
		System.out.println("Area: " + (int) this.getArea()); //truncar
		System.out.println("Color: " + color);
	}
	
	@Override
	public String toString() {
		return "Radio: " + radio + ", Color: " + color ;
	}
}
