package StringReverse;

public class DivideNEqual {

	public static void main(String[] args) {
		
		String s="aaacbbbbbcccc";
		int len=s.length();
		int n=3;
		int temp=0;
		int chars=len/n; //12/3 = 4
		System.out.println(len);
		String [] equalStr= new String[n];
		
		System.out.println(equalStr);
		if(len%n!=0) {
			System.out.println("this string not able to divide by N");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				
				String part=s.substring(i, i+chars);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for(int i = 0; i < equalStr.length; i++) {
			System.out.println(equalStr[i]);
		}
	}
	}
}

