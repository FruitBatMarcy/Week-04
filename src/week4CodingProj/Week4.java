package week4CodingProj;

public class Week4 {
	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};		//#1
		System.out.println(ages[ages.length-1] - ages[0]);
		
		int[] ages2 = new int[9];
		for(int i = 0; i < ages2.length; i++) {	//randomly assigning each value of ages from 0-100
			ages2[i] = (int)(Math.random() * 100);
		}
		System.out.println(ages2[ages.length-1] - ages2[0]); //works the same as the first one without breaking
		
		int sum = 0;
		for(int ix:ages2) {		//dynamically add up all values of ages2
			sum+=ix;                      
		}
		int ave = sum/ages.length;	//divide sum by length to get average
		System.out.println(ave);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	//#2
		
		sum = 0;
		for(String name:names) {	//reusing sum and ave
			sum+=name.length();
		}
		ave = sum/names.length;
		System.out.println(ave);
		
		StringBuilder sb = new StringBuilder();
		for(String name:names) {	
			sb.append(name);
			sb.append(" ");
		}
		System.out.println(sb);
		
		ages[ages.length-1] = 0;	//#3 the length minus one will always find the last element of an array
		ages[0] = 0; 				//#4 the first element of an array is always at [0]
		
		int[] nameLengths = new int[names.length];	//#5 initialized to the length of the data being referenced
		for(int ix = 0; ix<names.length;ix++) {		//iterated though each name and stored its length
			nameLengths[ix] = names[ix].length();
		}
		System.out.println(repeater("wow", 7));	//#7 test
		System.out.println(fullName("Steve","Buisness"));	//#8 test
		System.out.println(above100(ages)); //#9 test
		double[] arr1 = new double[12];
		double[] arr2 = new double[13];
		fillDoubleArray(arr1);
		fillDoubleArray(arr2);
		System.out.println(average(arr1));
		System.out.println(average(arr2));
		System.out.println(biggerAverage(arr1,arr2));
	}
	
	//#7 uses a for loop iterated n times to append the word in a string builder object
	public static String repeater(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for(int ix = 0; ix<n;ix++) {
			sb.append(word);
		}		
		return sb.toString();
	}
	//#8 uses StringBuilder class to append two names together with a space
	public static String fullName(String firstName,String lastName) {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName);
		sb.append(" ");
		sb.append(lastName);
		return sb.toString();
	}
	//#9 dynamic for loop iterates through all of arr adding each number to the sum which is compared to 100
	public static boolean above100(int[] arr) {
		int sum = 0;
		for(int ix:arr) {
			sum+=ix;
		}
		return sum >100;
	}
	//#10 dynamic loop to add all values of array and then return that divided by 
	public static double average(double[] arr) {
		double sum = 0;
		for(double ix:arr) {
			sum+=ix;
		}
		return sum/arr.length;
	}
	//#11 uses previous method to calculate averages and then compares them to each other
	public static boolean biggerAverage(double[] arr1,double[] arr2) {
		return average(arr1) > average(arr2);
	}
	//#12 returns true if isHotOutside is true and if money in pocket is greater than 10.50
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	//#13 I created this method to fill any array of doubles with random numbers so I wouldn't have to do it twice to test #11;
	public static void fillDoubleArray(double[] arr) {
		for(int ix = 0; ix <arr.length;ix++) {
			arr[ix] = Math.random() * 1000;
		}
			
	}
}











