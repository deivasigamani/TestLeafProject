package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAssignment {

	public static void main(String[] args) {

		String str = "google";
		
		char[] text = str.toCharArray();

		Set<Character> value = new LinkedHashSet<Character>();

		for (int i = 0; i < text.length; i++) {
		
			value.add(text[i]);

			
		}
		System.out.println(value);
	}

}
