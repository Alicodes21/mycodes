package Day4;

class Person {
 private String firstName;
 private String lastName;

 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }
}

class Employee1 extends Person {
	private int employeeId;
	private String jobTitle;

	public Employee1(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public String getLastName() {
		return super.getLastName() + ", " + jobTitle;
	}
}

public class Person_Main {

	public static void main(String[] args) {
		
		Employee1 employee1 = new Employee1("Amit", "Choudhury", 6996, "Senior Assosiate");
	    System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
		Employee1 employee2 = new Employee1("Rohit", "Choudhury", 9040, "HR");
	    System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
	}

}
