package herencia1;


public class cilindro extends circulo {
	private double altura;

	public cilindro(double radio) {
		super(radio);
		this.altura = 1.0;
	}
	
	public cilindro(double radio, double altura) {
		super(radio);
		this.altura = altura;
	}
	
	public cilindro(double radio, double altura, String color) {
		super(radio, color);
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return getArea() * altura;
	}
	
	@Override
    public String toString() {
        return "Radio: " + getRadio() + ", Color: " + getColor() + ", Altura: " + altura;
    }
	
	public void imprimirCilindro() {
	    System.out.println("Altura: " + altura);
	}
}
