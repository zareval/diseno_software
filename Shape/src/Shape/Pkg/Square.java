package Shape.Pkg;

public class Square extends Rectangle {
    private double lado;

    public Square() {
        setLargo(lado);
        setAncho(lado);
    }

    public Square(double lado) {
        super(lado, lado);
        this.lado = lado;
    }

    public Square(double lado, String color, boolean relleno) {
        super(); 
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        setLargo(lado); 
        setAncho(lado);
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho);
        lado = ancho;
    }

    @Override
    public void setLargo(double largo) {
        super.setLargo(largo);
        lado = largo;
    }

    @Override
    public String toString() {
        return "Cuadrado: " + super.toString().replace("Rectangulo: ", " ") + ", Lado: " + lado;
    }
}
