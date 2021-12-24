package PracticeDataStructures;

public class BubbleSortDescending {
	
	public static void swap(int array[],int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String args[]) {
		int array[] = {20,35,-15,7,55,1,-22};
		
		for(int unsortedArray=array.length-1;unsortedArray>0;unsortedArray--) {
			
			for(int i=0;i<unsortedArray;i++) {
				if(array[i]<array[i+1]) {
					swap(array,i,i+1);
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
		System.out.print("|"+array[i]);
		}
	}

}
