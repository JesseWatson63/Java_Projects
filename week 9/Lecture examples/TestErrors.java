public class TestErrors{
	
	public static void main(String[] args){
	
		try {
			System.out.println("Haha");
		} 
		catch (Exception E){
			System.out.println("HoHo");
		}
	
		double x = 1;
		double y = 0;
		double z = x/y;
		System.out.println("quotient is: " + z);
	
	}
}

//use loops and Arraylist
//Try {          }
//catch(   )  {             }
//finally{             }