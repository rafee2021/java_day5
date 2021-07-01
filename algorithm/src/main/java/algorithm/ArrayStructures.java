package algorithm;

public class ArrayStructures {

	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	//generate array with random numbers
	public void generateRandomArray() {
		
		for (int i = 0; i < arraySize; i++) {
			
			/* casts Math random class as int 
			 * multiplies that by 10 and adds 10
			 */
			theArray[i] = (int) (Math.random()*10 +10);
			
		}
	}
	
	//prints array in a nice format
	public void printArray() {
		
		System.out.println("Index|Num");
		
		for (int i = 0; i < arraySize; i++) {
			System.out.println("----------");
			System.out.print("| " + i + " |");
			System.out.println(theArray[i] + " |");
		}
	}
	
	//check if index is valid, then outputs that number from array
	public int getValueAtIndex(int index) {
		
		if(index < arraySize) return theArray[index];
		
		return 0;
	}
	
	
	//check if the following int is in the array
	public boolean value = true;
	
	public void checkNum(int num) {
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] != num) {
				value = false;
			}
		}
		System.out.println(value);
	}
	
	
	
}
