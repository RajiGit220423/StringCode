package StringReverse;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="raji";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch=str.charAt(i);
			rev=rev+ch;
			
			
		}
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Note Palindrome");
			}
}
