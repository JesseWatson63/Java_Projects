public class mpgTest{

	public static void main(String[] args){
	
		mpg m = new mpg("Toyota");

		System.out.println("Test case 1");


		System.out.println("Capacity of tank: " + m.getTank() + " " + "Gallons");
		System.out.println("Fill Up Cost: $" + m.getFillUpCost() + " " + " Dollars at $3.00 a gallon.");
		System.out.println("-------------------------------------------------");
		
		
		
		mpg m2 = new mpg("Toyota");
		m2.setType("J");
		System.out.println("Test case 2");
		System.out.println("Capacity of tank: " + m2.getTank() + " " + "Gallons");
		System.out.println("Fill Up Cost: $" + m2.getFillUpCost() + " " + "Dollars at $3.00 a gallon.");
		System.out.println("-------------------------------------------------");
		
		
		mpg m3 = new mpg("Toyota","J");
		System.out.println("Test case 3");
		System.out.println("Capacity of tank: " + m3.getTank() + " " + "Gallons");
		System.out.println("Fill Up Cost: $" + m3.getFillUpCost() + " " + "Dollars at $3.00 a gallon.");
		

	
	}	
}