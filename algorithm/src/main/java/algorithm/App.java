package algorithm;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "2112";
		
		Palindrome paladin = new Palindrome();
		paladin.palind(str);
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(5));
		newArray.checkNum(12);

		//find MaxCharacter
		//incomplete. in process of redoing
		MaxChar.maxCharacter("raafff");
		
		//Check candleSolutions.java for answer
		
	}

}
