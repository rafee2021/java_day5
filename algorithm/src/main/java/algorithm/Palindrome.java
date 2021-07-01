package algorithm;

public class Palindrome {
	
	public static void palind(String str) {
		
		//empty string that will hold the reverse of str
		String reverse = "";
		
		//for loop fills reverse string
		for (int i = str.length() -1; i >= 0; i--) {
			reverse += str.charAt(i);			
		}
		
		boolean palindrome = true;		
		
		//compares each character in both strings
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if (palindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
