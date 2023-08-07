package Day4;

class Parent{ 
	public void parentmethod(){ 
		System.out.println("This is parent class"); 
	}
}
class Child extends Parent{ 
	public void childmethod(){ 
		System.out.println("This is child class"); 
	}
}
public class Parent_Child_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.parentmethod();
		Child c = new Child();
		c.childmethod();
	}

}
