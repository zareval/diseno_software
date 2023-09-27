package CirculoHerencia.Pkg;


class Cilindro extends Circulo {
    double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double volumen() {
        return area() * altura;
    }
}
