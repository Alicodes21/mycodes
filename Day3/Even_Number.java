package Day3;

public class Even_Number {

	public static void main(String[] args) {
		
		int array[] = {10,23,58,49,66,20};
		int num = 0;
		for(int i = 0; i<array.length; i++) {
			if (array[i] % 2 == 0) {
				num = num + array[i];
			}
		}
		System.out.println("Sum Of Even Number is "+num);

	}

}
