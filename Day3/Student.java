package Day3;

public class Student {
	
	String name; int age; String address;
	

	Student() {
		name = "unknown";
		age = 0;
		address = "not available";
	}
	void setInfo(String n, int a) {
		System.out.println("Name is "+n);
		System.out.println("Age is "+a);
	}
	void setInfo(String n, int a, String ad) {
		System.out.println("Name is "+n);
		System.out.println("Age is "+a);
		System.out.println("Address is "+ad);
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s.setInfo("Amit", 26);
		s.setInfo("Amit Choudhury", 26, "Bhubaneswar");
		s1.setInfo("Rohit", 21);
		s1.setInfo("Rohit Choudhury", 21, "Odisha");
		s2.setInfo("C P", 54);
		s2.setInfo("C P Choudhury", 54, "Dumuduma");
		s3.setInfo("Sukanti", 50);
		s3.setInfo("Sukanti Choudhury", 54, "Khandagiri");
		s4.setInfo("Subashis", 47);
		s4.setInfo("Subashish Mohapatra", 45, "OldTown");
	}

}
