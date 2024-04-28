package StringReverse;

public class AddnumberinString {

	

		public static void main(String[] args) {

			String s = "Ra31ji22win";
			String d = "0";
			int sum = 0;

			for (int i = 0; i < s.length(); i++) {

				char ch = s.charAt(i);

				if (Character.isDigit(ch)) {

					d= d + ch;
									
				}
				else {
					if(!d.equals("")) {
						sum=sum+Integer.parseInt(d);
						d="";
					}
				}

			}

			System.out.println(sum);
		}

	}


