package Person.Pkg;

public class Staff extends Person {

    private String escuela;
    private double salario;

    public Staff(String nombre, String direccion, String escuela, double salario) {
        super(nombre, direccion);
        this.escuela = escuela;
        this.salario = salario;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirPersonal() {
        System.out.println("Escuela: " + escuela);
        System.out.println("Salario: " + salario);
    }

    @Override
    public String toString() {
        return "Escuela: " + escuela + ", Salario:" + salario;
    }
}

