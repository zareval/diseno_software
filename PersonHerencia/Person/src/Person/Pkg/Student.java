package Person.Pkg;

public class Student extends Person {

    private String programa;
    private int año;
    private double cuota;

    public Student(String nombre, String direccion, String programa, int año, double cuota) {
        super(nombre, direccion);
        this.programa = programa;
        this.año = año;
        this.cuota = cuota;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public void imprimirEstudiante() {
        System.out.println("Programa: " + programa);
        System.out.println("Año Actual: " + año);
        System.out.println("Cuota: " + cuota);
    }

    @Override
    public String toString() {
        return "Programa:" + programa + ", Año: " + año + ", Cuota: " + cuota;
    }
}
