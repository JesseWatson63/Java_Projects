public class Rectangle{

	
	public String testRectangle(int a, int b) {
		int side1;
		int side2;
		String statement;
		side1 = a;
		side2 = b;
		
			if(side1 == side2){
				statement = ("This is not a rectangle " + side1 + " " + side2);
			}else if (side1 != side2 && side1 != 0 && side2 != 0){
				statement = ("This is a rectangle " + side1 + " " + side2);
			} else if (side1 == 0 || side2 == 0){
				statement = ("This is a line " + side1 + " " + side2);
			} else {
				statement = ("");
			}
		return statement;
	}
	
	
}