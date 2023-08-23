package EjercicioCirculo.Pkg;

public class Circulo {
	
	private double radio = 25;
	double area;
	double circunferencia;
	private String resultado;
	
	public Circulo(){
		// TODO Auto-generated constructor stub
	}
	
	public double getradio() {
		return radio;
	}
	
	public double getarea() {
		return area;
	}
	
	public double getcircunferencia() {
		return circunferencia;
	}
	
	public String getresultado() {
		return resultado;
	}
	
	public void setresultado(String resultado) {
		this.resultado=resultado;
	}
	
	public void mostrarRadio(double radio) {
		
		System.out.println("El radio del circulo es de: " + radio);
	}
	
	public void mostrarCircunferencia(double circunferencia) {
		double PI=3.1416;
		circunferencia=2*PI*radio;
		System.out.println("La circunferencia del circulo es: " + circunferencia);
	}
	
	public void mostrarArea(double area) {
		area = Math.PI*radio*radio;
		System.out.println("El area del circulo es: " + area);
	}


}