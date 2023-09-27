package CirculoHerencia.Pkg;

import java.util.Scanner;

class Circulo {
 double radio;

 public Circulo(double radio) {
     this.radio = radio;
 }

 public void leerRadio() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Introduce el radio del círculo (utilizar ',' en vez de '.'): ");
     this.radio = scanner.nextDouble();
 }

 public double area() {
     return Math.PI * Math.pow(radio, 2);
 }

 public double circunferencia() {
     return 2 * Math.PI * radio;
 }
}

