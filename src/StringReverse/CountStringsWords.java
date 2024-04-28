package StringReverse;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountStringsWords {

	public static void main(String[] args) {
		
		String name = "Welcome to java sql java to java sql plsql";
		String[] x = name.split(" ");

		Map<String, Integer> emp = new LinkedHashMap<>();
		for (String v : x) {
			if (emp.containsKey(v)) {
				int count = emp.get(v);
				emp.put(v, count + 1);
			} else {
				emp.put(v, 1);
			}

		}
		System.out.println(emp);
		
	}
}
