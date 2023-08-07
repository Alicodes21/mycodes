package Day5;

import java.util.regex.*;

class UserMainCode {
    public static int validatePAN(String panNumber) {
        // Regular expression to validate PAN number
        String panPattern = "[A-Z]{3}[0-9]{4}[A-Z]{1}";

        if (Pattern.matches(panPattern, panNumber)) {
            return 1; // Valid PAN number
        } else {
            return 2; // Invalid PAN number
        }
    }
}
public class Pan_Main {

	public static void main(String[] args) {
		String pan1 = "ALD3245E";
        String pan2 = "OLE124F";

        int result1 = UserMainCode.validatePAN(pan1);
        int result2 = UserMainCode.validatePAN(pan2);

        // Printing the results
        if (result1 == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (result2 == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

	}

}
