package StringReverse;

public class SplitString {

	public static void main(String[] args) {

		String name = "cardc";

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			char ch = name.charAt(i);

			rev = rev + ch;
		}

		if (rev.equals(name)) {

			System.out.println("Palindrome String");
		} else
			System.out.println(" Not Palindrome String");

	}

}
