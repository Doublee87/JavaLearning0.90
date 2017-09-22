public class PT1 {

	
	public static void main(String[] args) {
		/////////// Problem 1 //////////////
		// Do not change the names of these variables. You must use these variables in your program.
		// Test your code with different values to make sure your code is correct.
		int base = 6;
		int triangleHt = 5;
		int rectangleHt = 4;
		
		double totalArea = 0; // initializing this to 0 so the print statement will compile
		// If you change the above lines, put them back in this condition before handing in.
		
		// calculate totalArea Put your code here. It should start with: totalArea =
		// You must use the variables shown above.
		double triArea;
		triArea = 0.5 * base * triangleHt;
		double recArea;
		recArea = base * rectangleHt;
		totalArea = triArea + recArea;
		
		//Do not change this print statement
		System.out.println("totalArea = "+totalArea);
		
		/////////// Problem 2 //////////////
		// Do not change the names of these variables. You must use these variables in your program.
		// Test your code with different values to make sure your code is correct.
		int MondayTemp = 82;
		int TuesdayTemp = 77;
		int WednesdayTemp = 85;
		int ThursdayTemp = 70;
		int FridayTemp = 93;
		
		float averageTemp = 0; // initializing this to 0 so the print statement will compile
		// If you change the above lines, put them back in this condition before handing in.
		
		float numDays = 5;
		averageTemp = (MondayTemp + TuesdayTemp + WednesdayTemp + ThursdayTemp + FridayTemp)/numDays;
		
		//Do not change this print statement
		System.out.println("averageTemp = "+averageTemp);
		
		System.out.print("Problem 3: ");
		problem3();
		System.out.println("\n");
		
		System.out.println("Problem 4: ");
		problem4();
		System.out.println("\n");
		
		System.out.println("Problem 5: ");
		problem5();	
		
	}
	
	public static void problem3() {
		/////////// Problem 3 //////////////
		// Write a for loop that produces the following output. There is one space between the numbers.
		// 1 3 9 27 81 243 729
		for (int i=1; i<=729; i*=3){ // or i=i*3
			System.out.print(i+" ");
		}
	}
    
	public static void problem4() {
		/////////// Problem 4 //////////////
		// Write nested for loops that produce the following output:
		// (You must use for loops.)
		// 123456
		// 23456
		// 3456
		// 456
		for (int i = 1; i <=4; i++){
			System.out.println("");
				for (int j =i; j<=6; j++){
					System.out.print(j);
			
		}
	}

		
	}
	
	public static void problem5() {
		/////////// Problem 5 //////////////
		// Write nested for loops that produce the following output
		// (You must use for loops.)
		// 1 2 3 4 5 6 7 8 9 
		// 1 3 5 7 9 
		// 1 4 7 
		// 1 5 9 
		// 1 6 
		// 1 7 
		// 1 8 
		// 1 9 
		// 1
		for (int i = 1; i <=9; i++){
			System.out.println("");
				for (int j=1; j<=9; j+=i){
					System.out.print(j+" ");
		}
	}
	}
	
}
