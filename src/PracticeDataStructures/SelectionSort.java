package PracticeDataStructures;

public class SelectionSort {
	
	public static void swap(int array[], int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String args[]) {
		
		int array[] = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedArray=array.length-1;lastUnsortedArray>0;lastUnsortedArray--) {
			
			int largest = 0;
			for(int i=1;i<=lastUnsortedArray;i++) {
				if(array[i]>array[largest]) {
					largest =i;
				}
			}
			swap(array,largest,lastUnsortedArray);
			for(int i=0;i<array.length;i++) {
				System.out.print("|"+array[i]);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		for(int i=0;i<array.length;i++) {
			System.out.print("||"+array[i]);
		}
	}
}
