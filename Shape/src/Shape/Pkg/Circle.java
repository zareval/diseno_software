package Shape.Pkg;

public class Circle extends Shape {
    private double radio;

    public Circle() {
        radio = 1.0;
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public Circle(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getÁrea() {
        double áreaCalculada = Math.PI * this.radio * this.radio;
        return áreaCalculada;
    }

    public double getPerímetro() {
        double circunferencia = 2 * Math.PI * this.radio;
        return circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo: " + super.toString() + ", Radio: " + radio;
    }
}
