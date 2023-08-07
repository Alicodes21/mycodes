package Day3;

class Undergraduate{
	void study(){
		System.out.println("I am an Undergraduate");
	}
}
class Postgraduate{
	void study() {
		System.out.println("I am a Postgraduate");
	}
}
public class Degree {
	
	void getDegree() {
		System.out.println("I got a degree");
	}
	public static void main(String[] args) {
		Undergraduate UG = new Undergraduate();
		Postgraduate PG = new Postgraduate();
		Degree d = new Degree();
		UG.study();
		PG.study();
		d.getDegree();

	}

}
