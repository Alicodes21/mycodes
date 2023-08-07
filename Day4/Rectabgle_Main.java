package Day4;

class Rectangle1{    
	int length,breadth;    
	public Rectangle1(int l, int b){
		length = l;
		breadth = b;
	}    
	void print_area(){
		System.out.println(length*breadth);
	}
	void print_perimeter(){
		System.out.println(2*(length+breadth));
	}
}
class Square1 extends Rectangle1{
	public Square1(int s){
		super(s, s);
	}
}
public class Rectabgle_Main {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1 (2,3);
		Square1 s = new Square1 (5);
		r.print_area();r.print_perimeter();
		s.print_area();
		s.print_perimeter();

	}

}
