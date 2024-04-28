package StringReverse;

import java.util.Scanner;

public class RoughNote {

	public static void main(String[] args) {

		String s = "indian";
		String b = "pakshitan";

		String w = "";

		b = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();
		s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ') 
				w += c;
				else 
				System.out.println(w.charAt(0));
				w="";

			
		}
	}
}

