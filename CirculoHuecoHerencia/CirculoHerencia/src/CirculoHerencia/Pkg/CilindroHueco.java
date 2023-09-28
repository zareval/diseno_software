package CirculoHerencia.Pkg;

class CilindroHueco extends Cilindro {
    private double radioInterior;

    public CilindroHueco(double radioExterior, double radioInterior, double altura) {
        super(radioExterior, altura);
        this.radioInterior = radioInterior;
    }

    public double volumenHueco() {
        double volumenExterior = super.volumen();
        double volumenInterior = Math.PI * Math.pow(radioInterior, 2) * altura;
        return volumenExterior - volumenInterior;
    }
}
