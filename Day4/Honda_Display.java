package Day4;

class Honda {
	
	static String bname = "HONDA"; 
	static String tagline = "The Power Of Dreams";
	
	static void dis() {
		System.out.println("Car Brand Is "+bname);
		System.out.println("Brand Tagline Is "+tagline);
	}

}
class HM extends Honda{
	static String type = "SADAN";
	static String level = "TOP";
	
	static void hmcar() {
		Honda.dis();
		System.out.println("Car Type Is "+type);
		System.out.println("Level is "+level);
	}
	
}
class HM1 extends HM{
	static String liquid1 = "Petrol";
	static void hm1() {
		Honda.dis();
		HM.hmcar();
		System.out.println("Oil Model Is "+liquid1);
	}
}
class HM2 extends HM{
	static String liquid2 = "Desiel";
	static void hm2() {
		Honda.dis();
		HM.hmcar();
		System.out.println("Oil Model Is "+liquid2);
	}
}
class H1 extends Honda{
	static String type = "SUV";
	static String feature = "4x4";
	static String liquid1 = "Petrol";
	
	static void h1() {
		Honda.dis();
		System.out.println("Car Type Is "+type);
		System.out.println("Level is "+feature);
		System.out.println("Oil Model is "+liquid1);
	}
}
class H2 extends H1{
	static String liquid2 = "Desiel";
	
	static void h2() {
		Honda.dis();
		System.out.println("Car Type Is "+H1.type);
		System.out.println("Level is "+H2.feature);
		System.out.println("Oil Model is "+liquid2);
	}
}
public class Honda_Display {

	public static void main(String[] args) {
		
		HM1.hm1();
		System.out.println("---------------------------------------------------");
		HM2.hm2();
		System.out.println("---------------------------------------------------");
		H1.h1();
		System.out.println("---------------------------------------------------");
		H2.h2();

	}

}
