package algorithm;

public class MaxChar {

	public static void maxCharacter(String str) {
		
		//holds a character
		String character = "";
		
		//holds duplicate values
		String duplicates = "";
		
		//index location
		int index = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			
			
			//casts a character into a string type
			//runs through all characters in string
			//current is set to a different character from the string
			String current = Character.toString(str.charAt(i));
						
			if (character.contains(current)) {
				
				if (!duplicates.contains(current)) {
					duplicates += current;	
					
				}
				
			}
			
			character += current;
			
		}
		
		System.out.println(duplicates);
		System.out.println(index);

	}
}
