/**
Student Name: Ali Haidar
Student Number: 8328785
Course Code: CSI3531

Below is the code that displays all the prime numbers inferior or equal to that given.

**/


public class PrimeNumbers {
	
	public static void main(String args[]) {
		
		Thread t1 = new Thread(new Runnable() { // creating a new thread and overriding run() method
			
			public void run() {
				for (int i = 1; i <= Integer.parseInt(args[0]); i++) {	// loop up to number given
					int div = 0;	 //keeps track of how many numbers a value is divisible by
					for (int j = i; j >= 1; j--) {
						if (i % j == 0) { 
							div++;
						}
					}
					if (div == 2) { // prints numbers having exactly 2 divisors, aka prime numbers
						System.out.println(i);
					}
				}
			}
			
		});
		
		t1.start(); //starts thread
		
	}
}