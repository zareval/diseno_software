package CirculoHerencia.Pkg;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(0); 
        circulo.leerRadio();

        Cilindro cilindro = new Cilindro(circulo.radio, 5.0); 

        CilindroHueco cilindroHueco = new CilindroHueco(circulo.radio, 2.0, 7.0); 
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumenHueco());
    }
}
