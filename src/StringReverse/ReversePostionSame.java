package StringReverse;

public class ReversePostionSame {

	public static void main(String[] args) {

		String str = "Test the product";
		String ar[] = str.split(" ");

		for (int i = 0; i < ar.length; i++) {

			for (int j = ar[i].length()- 1; j >= 0; j--) {

				System.out.print(ar[i].charAt(j));

			}
			System.out.print(" ");
		}

	}

}
