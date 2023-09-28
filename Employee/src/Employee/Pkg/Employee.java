package Employee.Pkg;

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private int salary;
	private int result;
	
	public Employee(int ID,String firstName, String lastName, int salary) {
		//constructor
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}
	
	public int getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getAnnualSalary() {
		int annualSalary=12*this.salary;
		return annualSalary;
	}
	
	public int result() {
		int percent = 50;
		// TODO Auto-generated method stub
		int raiseSalary = (percent*salary)/100;
		int result=salary+raiseSalary;
		return result;
	}
		
	@Override
	public String toString() {
		return "Employee: ID:"+ID+
				", First Name:"+firstName+
				", Last Name:"+lastName+
				", Salary:"+salary;
	}

	
}

