public class Test4{

	public static void main(String[] args){

	//test for 1 arg constructor...
	Specialist c=new Specialist("Mike");

	System.out.println("Test case 1");
	System.out.println("Name: " + c.getName());
	System.out.println("Type: " + c.getType());
	System.out.println("Pay: " + c.getPayRate());
	System.out.println("Bill: " + c.getBillRate());
	System.out.println("--------------------------------");

	//test for 1 arg constructor & manual set type
	Specialist c2=new Specialist("Mike");
	c2.setType("S");
	System.out.println("Test case 2");
	System.out.println("Name: " + c2.getName());
	System.out.println("Type: " + c2.getType());
	System.out.println("Pay: " + c2.getPayRate());
	System.out.println("Bill: " + c2.getBillRate());
	System.out.println("--------------------------------");

	//test for 2 arg constructor
	Specialist c3=new Specialist("Mike","J");
	
	System.out.println("Test case 3");
	System.out.println("Name: " + c3.getName());
	System.out.println("Type: " + c3.getType());
	System.out.println("Pay: " + c3.getPayRate());
	System.out.println("Bill: " + c3.getBillRate());
	}

}