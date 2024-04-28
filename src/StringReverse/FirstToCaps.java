package StringReverse;

public class FirstToCaps {

	public static void main(String[] args) {

		String s="indian premier league";
				
		String [] myName=s.split(" ");
		
		System.out.println(myName.length);
		
		   for(int i=0; i<myName.length; i++)
		   {
		       if (!myName[i].isEmpty()) {
		          
		          System.out.print(Character.toUpperCase(myName[i].charAt(0)));
		       }              
		   }          
	}
}
