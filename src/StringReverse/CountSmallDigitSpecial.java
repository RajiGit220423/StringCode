package StringReverse;

public class CountSmallDigitSpecial {

	public static void main(String[] args) {

		String name = "Welcome@123456";

		int lcount = 0, dcount = 0, ucount = 0, spcount = 0;

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (Character.isLowerCase(ch)) {

				lcount++;
			}
			if (Character.isUpperCase(ch)) {
				ucount++;
			}
			if (Character.isDigit(ch)) {

				dcount++;
			} else
				spcount++;
		}

		System.out.println("Lowercase: " + lcount);
		System.out.println("Uppercase: " + ucount);
		System.out.println("Digit: " + dcount);
		System.out.println("Special Character: " + spcount);
	}
}
