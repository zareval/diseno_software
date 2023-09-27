package Person.Pkg;

public class Main {
	public static void main(String[] args) {
		Student myStudent = new Student("Zarella", "Terrazas del Norte", "Ingenieria de Software", 2023, 3800000.99);
		
		System.out.println("Información del estudiante");
		myStudent.imprimirPersona();
		myStudent.imprimirEstudiante();
		
		System.out.println("______________________________");
		System.out.println("");
		
		Staff myStaff = new Staff("Valentina","Corazón de Jesús", "Colegio Filipense 'Nuestra Señora de la Esperanza'",2500000.99);
		
		System.out.println("Información del personal ");
		myStaff.imprimirPersona();
		myStaff.imprimirPersonal();
	}
}
		
	
	
