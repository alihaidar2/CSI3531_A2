/**
Student Name: Ali Haidar
Student Number: 8328785
Course Code: CSI3531

Below is the code that displays the list of Fibonacci numbers of a number given.
The values are stored in an array with access to the run() method.
The values of that array are then used and printed.

**/


public class Fibonacci {
	

	protected static Thread t1;

	public static void main(String[] args) {
		
		final int size = Integer.parseInt(args[0]); //integer holding size of array
		final int[] array = new int[size + 1]; // creation of array of fibonacci numbers

		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
						
				int a = 0, b = 1, c; // initialisation of integers
				array[0] = a; // setting 0 and 1 as first values of the array
				array[1] = b;
				
				for (int i = 2; i < array.length-1; i++) { // loop populating the array
					c = a + b;
					array[i] = c;
					a = b;
					b = c;
				}	
			}
		});
		
		t1.start(); // start of thread
		
		try {
			t1.join(); //waits for thread to die
		} catch (InterruptedException e) {
			System.out.println("Caught");
		}
		
		 for (int j = 0; j < size; j++) { // loop printing the array of Fibonacci numbers
		 	System.out.print(array[j] + " ");
		 }
		 System.out.println();
	}
}