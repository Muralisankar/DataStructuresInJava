package PracticeDataStructures;

public class InsertionSortDescending {
	
	public static void main(String args[]) {
		
		int array[] = {20,35,-15,7,55,1,-22};
		
		for(int unsortedArray=1;unsortedArray<array.length;unsortedArray++) {
			int newElement = array[unsortedArray];
			int i;
			for(i=unsortedArray;i>0 && array[i-1]<newElement;i--) {
				array[i] = array[i-1];
			}
			
			array[i] = newElement;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print("|"+array[i]);
		}
	}

}
