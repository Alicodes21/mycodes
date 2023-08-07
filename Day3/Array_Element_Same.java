package Day3;

public class Array_Element_Same {

	public static void main(String[] args) {
		
		int num[] = {1,1,1,1,1,1,1,2,1,1,1};
		int count = 0;
		for (int i = 1; i<num.length; i++) {
			if (num[0] == num[i]) {
				count = count + 1;
			}
		}
		if (count == num.length - 1) {
			System.out.println("All Element of An Array is Same");
		}
		else {
			System.out.println("All Element Of An Array is Not Same");
				
		}
	}

}
