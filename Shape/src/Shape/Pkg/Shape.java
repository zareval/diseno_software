package Shape.Pkg;

public class Shape {
	private String color;
	private boolean relleno;
	
	public Shape() {
		super();
		color = "Red";
		relleno = true;
	}
	
	public Shape(String color, boolean relleno) {
		super();
		this.color = color;
		this.relleno = relleno;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isRelleno() {
		return relleno;
	}
	
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
	@Override
	public String toString() {
		return "Figura: Color: " + color + ", Relleno: " + relleno;
	}
}
