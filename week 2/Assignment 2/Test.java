public class Test{

	public static void main (String[] args){
		
	
		//User enabled input
		Rectangle a = new Rectangle();
		System.out.println(a.testRectangle(2,3));
		System.out.println("____________________");
		
		//Random number thrown in to test for rectangle
		Rectangle b = new Rectangle();
		int randomNum1 =(int)(Math.random()* 5);
		int randomNum2 =(int)(Math.random()* 5);
		System.out.println(b.testRectangle(randomNum1,randomNum2));
		System.out.println("____________________");
		
		//Random number thrown in to test for rectangle
		Rectangle c = new Rectangle();
		int randomNum3 =(int)(Math.random()* 5);
		int randomNum4 =(int)(Math.random()* 5);
		System.out.println(c.testRectangle(randomNum3,randomNum4));
		System.out.println("____________________");
	}
}