public class Rectangle{
	public void MakeRectangle() {
	//Declaring my variables
	int side1;
	int side2;
	int area;
	int perimeter;
	
	
	//making my random side lengths
	int lengthMaker1 = (int) (Math.random() * 5);
	int lengthMaker2 = (int) (Math.random() * 5);
	
	
	//turning my ints into lengths this was not necessary though did it first 
	side1 = lengthMaker1;
	side2 = lengthMaker2;
	//my math formulas
	
	
	area = side1 * side2;
	perimeter = (2 * side1) + (2 * side2);
	
	
	
	//Lets show some text
	System.out.println("Side 1 : " + side1);
	System.out.println("Side 2 : " + side2);
	System.out.println("Area: " + area);
	System.out.println("Perimeter: " + perimeter);
	//Lets me find a square
	if(side1 == side2){
	System.out.println("Square: True");
	}
	else {
	System.out.println("Square: False");
	}
	}
}