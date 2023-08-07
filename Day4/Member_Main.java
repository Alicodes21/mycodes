package Day4;

class Member {
	
	private String name;
	private int age;
	private String phnumber;
	private String address;
	private double salary;
	
	public Member(String name, int age, String phnumber, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phnumber = phnumber;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary() {
		System.out.println("Salary is "+salary);
	}

}
class Employee extends Member{
	private String specialization ;
	
	public Employee(String name, int age, String phnumber, String address, double salary,String specialization) {
		super(name, age, phnumber, address, salary);
		this.specialization = specialization;
		// TODO Auto-generated constructor stub
	}
	
}
class Manager extends Member{
	private String department;

	public Manager(String name, int age, String phnumber, String address, double salary,String department) {
		super(name, age, phnumber, address, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}
	
}
public class Member_Main {

	public static void main(String[] args) {
		Employee e = new Employee("Amit", 26, "9853746996", "BBSR,ODISHA", 50000.0, "MECHANICAL");
		e.printSalary();
		Manager m = new Manager("Rohit", 22, "9040660093", "Dumuduma,Odisha", 30000.0, "Mechanical");
		m.printSalary();

	}

}
