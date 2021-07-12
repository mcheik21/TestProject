package Array;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		
		// Create an array and add the integer number 
		int a[] = new int[4];
		char arr[] = new char[4]; 
		String arrString[] = new String[4];
		
		// Create an object for the Scanner Class	
		Scanner in = new Scanner(System.in);		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the integer of the Array: ");			
			// use Scanner object to take input
			a[i]  = in.nextInt();			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the characters of the Array: ");	
			// use Scanner object to take input
			arr[i]= in.next().charAt(0);			
		}
		
		for(int i=0;i<arrString.length;i++) {
			System.out.println("Enter the String of the Array: ");			
			// use Scanner object to take input
			arrString[i]  = in.nextLine();			
		}
		
		// Print the number in the Array
		System.out.print("array element are:\n");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		// Print the number in the Array
	    System.out.print("the character array are:\n");
	    for(int i=0;i<arr.length;i++)
	    	System.out.println(arr[i]+" ");
	    
	    // Print the number in the Array
	    System.out.print("the String array are:\n");
	    for(int i=0;i<arrString.length;i++)
	    	System.out.println(arrString[i]+" ");
		
		// Return the maximum in Array
		Maximum M = new Maximum();
		System.out.println("the maximum number for this Array is: " +M.max(a));
		
		

	}

}
