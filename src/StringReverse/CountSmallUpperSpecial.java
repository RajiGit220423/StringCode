package StringReverse;

public class CountSmallUpperSpecial {

	public static void main(String[] args) {
		
		String s="Good Morning! Mr. James Potter. Had your breakfast?";
		String lcount="", ucount="",spcount="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				ucount=ucount+ch;
			}if(Character.isLowerCase(ch)) {
				lcount=lcount+ch;
			}else
				if(!Character.isAlphabetic(ch)&&Character.isDigit(ch)) {
					spcount=spcount+ch;
				}
					
		}
		System.out.println(lcount);
		System.out.println(spcount);
		System.out.println(ucount);
				
	}
}
