package Person.Pkg;

public class Person {

    private String nombre;
    private String direccion;

    public Person(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String dirección) {
        this.direccion = dirección;
    }

    public void imprimirPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Dirección:" + direccion;
    }
}

