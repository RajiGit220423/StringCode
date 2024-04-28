package StringReverse;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String s= "Remove all space";
		
		s=s.replaceAll(" ", "");
		
		System.out.println(s);
		
		String s3="Java wins the race";
		
		char c='$';
		
		s3=s3.replace(' ', c);
				
		System.out.println(s3);
		
	}
}
