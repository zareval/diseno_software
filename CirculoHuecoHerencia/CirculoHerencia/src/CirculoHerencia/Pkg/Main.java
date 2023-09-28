package CirculoHerencia.Pkg;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(0); 
        circulo.leerRadio();

        Cilindro cilindro = new Cilindro(circulo.radio, 8); 

        CilindroHueco cilindroHueco = new CilindroHueco(circulo.radio, 2.0, 7.0); 
        System.out.println("Circunferencia del círculo: " + (int) circulo.circunferencia()); //Truncar
        System.out.println("Área del círculo: " + (int) circulo.area()); //Truncar
        System.out.println("Volumen del cilindro: " + (int) cilindro.volumen()); //Truncar
        System.out.println("Volumen del cilindro hueco: " + (int) cilindroHueco.volumenHueco()); //Truncar
    }
}
