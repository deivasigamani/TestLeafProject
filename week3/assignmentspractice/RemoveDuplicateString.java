package week3.assignmentspractice;

import java.util.Iterator;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String text = "a b c a a a";	
		
		int count;
		
		String[]afterSplit=text.split(" ");
		for (int i = 0; i < afterSplit.length; i++) {
			
				for (int j = i+1; j < afterSplit.length; j++) {
					
					if(afterSplit[i]==afterSplit[j]) {
						
						System.out.println("The Duplicate "+ afterSplit[j]);
					}	
				
					else {
						System.out.println("There is no duplicate");
					}
				}
			
		}
		
		
	}
	}


