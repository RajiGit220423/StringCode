package StringReverse;

public class Vowel {

	public static void main(String[] args) {
		
		String name="Welcome";
		String vowelCount="";
		
		String nameUp=name.toUpperCase();
		
		for(int i =0;i<nameUp.length();i++) {
			
			char ch=nameUp.charAt(i);
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				vowelCount=vowelCount+ch;
				
				//vowelCount++ = for Count Vowels 
			}
		}
		
		System.out.println(vowelCount);
		
		
	} 
	
}
