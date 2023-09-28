package herencia1;


public class main {
    public static void main(String[] args) {
        circulo myCirculo = new circulo();
        System.out.println("- CÍRCULO - ");
        System.out.println("");
        myCirculo.imprimirCirculo();
        System.out.println("");

        cilindro myCilindro = new cilindro(2.3, 2.1, "Rojo");
        System.out.println("- CILINDRO - ");
        System.out.println("");
        System.out.println("Radio: " + myCilindro.getRadio());
        System.out.println("Color: " + myCilindro.getColor());
        myCilindro.imprimirCilindro();
        System.out.println("Volumen: " + (int) myCilindro.getVolumen()); // Truncar
    }
}

