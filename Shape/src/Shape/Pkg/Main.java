package Shape.Pkg;

public class Main {

    public static void main(String[] args) {
        Circle círculo = new Circle();
        
        System.out.println(círculo.toString());
        
        System.out.println("Área: " + (int) círculo.getÁrea());
        System.out.println("Perímetro: " + (int) círculo.getPerímetro());

        System.out.println("------------------------------------------------------------");
        
        Rectangle rectángulo = new Rectangle();
        
        System.out.println(rectángulo.toString());
        
        System.out.println("Área: " + (int) rectángulo.getÁrea());
        System.out.println("Perímetro: " + (int) rectángulo.getPerímetro());

        System.out.println("------------------------------------------------------------");

        Square cuadrado = new Square(5);
        
        System.out.println(cuadrado.toString());
    }
}
