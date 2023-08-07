package Day3;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentage) {
        double increaseAmt = (percentage / 100) * salary;
        salary += increaseAmt;
    }
	public static void main(String[] args) {
		
		String name = "Amit Choudhury";
        String jobTitle = "Software Engineer";
        double salary = 30000.0;

        Employee employee = new Employee(name, jobTitle, salary);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Initial Salary: " + employee.getSalary());

        double perIncrease = 5.0;
        employee.updateSalary(perIncrease);

        System.out.println("Updated Salary: " + employee.getSalary());

	}

}
