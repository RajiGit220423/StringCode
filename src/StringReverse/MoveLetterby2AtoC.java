package StringReverse;

public class MoveLetterby2AtoC {

	public static void main(String[] args) {
		
		String s="however";
		String enc="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			
				
				ch-=26;
				ch+=2;
				enc=enc+ch;
			
		}
		System.out.println(enc);
	
}}
