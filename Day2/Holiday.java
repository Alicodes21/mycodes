package Day2;

public class Holiday {
	
	private String name; 
	private int hday; 
	private String fmonth;
	
	public Holiday(String n, int d, String m) {
		name = n;
		hday = d;
		fmonth = m;
	}
	public boolean inSameMonth(Holiday ho) {
		return this.fmonth.equals(ho.fmonth);
	}
	public static double avgDate(Holiday[] ho) {
		int sum = 0;
		
		for (int i = 0; i < ho.length; i++) {
			sum = sum + ho[i].hday;
		}
		return ((double)sum)/ ho.length;
	}

	public static void main(String[] args) {
		
		Holiday ho = new Holiday("Independence Day", 4, "July");
		ho.inSameMonth(ho);
	}

}
