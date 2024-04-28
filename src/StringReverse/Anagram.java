package StringReverse;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="Listen";
		String s2="Slient";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("its not Anagram String");
			
		}
		else {
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			System.out.println(str1);
			System.out.println(str2);
			if(Arrays.equals(str1, str2) ==true){
				System.out.println("Its Anagram ");
			}else
				System.out.println("Its not Anagram");
		}
	}

}
