package Employee.Pkg;

public class EjercicioEmployee {
	
	public EjercicioEmployee(){
		//constructor
	}
	
	public static void main(String[] args) {
		Employee miEmployee = new Employee(10,"Zarella","Burbano",1200000);
		System.out.println("Employee's Annual Salary");
		System.out.println(miEmployee.getAnnualSalary());
		System.out.println(miEmployee);
		System.out.println("Employee's Salary with +50%: "+miEmployee.result());
		
	}
}
