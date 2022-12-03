package week3.assignmentspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccerenceString {

	public static void main(String[] args) {

		String s = "Animalllll";

		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		
		char value[] = s.toCharArray();

		for (int i = 0; i < value.length; i++) {

			if (occ.containsKey(value[i])) {

				int finalVal = occ.get(value[i]);

				occ.put(value[i], finalVal+1);
			} else
				occ.put(value[i], 1);

		}
		System.out.println(occ);

	}

}
