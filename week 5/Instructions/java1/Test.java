public class Test{

	public static void main(String[] args){

	//test for 1 arg constructor...
	Consultant c=new Consultant("Mike");

	System.out.println("Test case 1");
	System.out.println("Name: " + c.getName());
	System.out.println("Type: " + c.getType());
	System.out.println("Pay: " + c.getPayRate());
	System.out.println("Bill: " + c.getBillRate());
	System.out.println("--------------------------------");

	//test for 1 arg constructor & manual set type
	Consultant c2=new Consultant("Mike");
	c2.setType("S");
	System.out.println("Test case 2");
	System.out.println("Name: " + c2.getName());
	System.out.println("Type: " + c2.getType());
	System.out.println("Pay: " + c2.getPayRate());
	System.out.println("Bill: " + c2.getBillRate());
	System.out.println("--------------------------------");

	//test for 2 arg constructor
	Consultant c3=new Consultant("Mike","J");
	
	System.out.println("Test case 3");
	System.out.println("Name: " + c3.getName());
	System.out.println("Type: " + c3.getType());
	System.out.println("Pay: " + c3.getPayRate());
	System.out.println("Bill: " + c3.getBillRate());
	}

}