package PracticeDataStructures;

import java.util.Vector;

public class FizzBuzz {
	
	public static Vector<String> fizzbuzz(int n){
		
		Vector<String> result = new Vector<String>();
		
		for(int i=0;i<n;i++) {
			
			if((i%15)==0) {
			result.add("Fizzbuzz");
		} 
		else if((i%3)==0) {
			result.add("Fizz");
			
		} 
		else if((i%5)==0) {
			result.add("Buzz");
		}
		else {
			result.add(i+"");
		}
	}
		
		return result;
	}
	
	public static void main(String args[]) {
		
		Vector<String> result = FizzBuzz.fizzbuzz(100);
		
		System.out.println(result);
		
	}

}
