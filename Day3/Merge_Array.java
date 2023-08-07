package Day3;

public class Merge_Array {

	public static void main(String[] args) {
		int array[] = {10,23,58,49,66,20};
		int arr [] = {11,22,33,44};
		int s = array.length;
		int s1 = arr.length;
		int narr [] = new int [s+s1];
		
		for(int i = 0; i < array.length; i++) {
			narr [i] = array [i];
		}
		for(int j = 0; j < arr.length; j++) {
			narr [s] = arr [j];
			s = s + 1;
		}
		for(int z = 0; z < narr.length; z++) {
			System.out.print(narr[z]+" ");
		}

	}

}
