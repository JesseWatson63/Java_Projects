class Lab2 {
	
	int width;
	int height;
	int area;

	 

	
	
void rectangleTest () {
		int i=(int) (Math.random() * 5);
		int h=(int) (Math.random() * 5);
	
		int setSide1 = i;
		int setSide2 = h;
		int area = setSide1 * setSide2;
		int perimeter = ((2* i) + (2 * h));
		
		if (setSide1 == setSide2){
			System.out.println("Square:");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Perimeter:" + " " + perimeter);
			System.out.println("Square:" + " " + "true");
		}
		else if (setSide1 == 0){
			System.out.println("Straight line");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Square:" + " " + "false");
		}
		else if (setSide2 == 0){
			System.out.println("Straight line");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);	
			System.out.println("Square:" + " " + "false");
		}
		else
		{
			System.out.println("Rectangle:");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Perimeter:" + " " + perimeter);
			System.out.println("Square:" + " " + "false");
		}

	}
	
	
void rectangleTest2 () {
		int i=(int) (Math.random() * 5);
		int h=(int) (Math.random() * 5);
		int setSide1 = i;
		int setSide2 = h;
		int area = setSide1 * setSide2;
		int perimeter = ((2* i) + (2 * h));
		
		if (setSide1 == setSide2){
			System.out.println("Square:");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Perimeter:" + " " + perimeter);
			System.out.println("Square:" + " " + "true");
		}
		else if (setSide1 == 0){
			System.out.println("Straight line");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Square:" + " " + "false");
		}
		else if (setSide2 == 0){
			System.out.println("Straight line");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);	
			System.out.println("Square:" + " " + "false");
		}
		else
		{
			System.out.println("Rectangle:");
			System.out.println("Side 1:" + " " + i);
			System.out.println("Side 2:" + " " + h);
			System.out.println("Area:" + " " + area);
			System.out.println("Perimeter:" + " " + perimeter);
			System.out.println("Square:" + " " + "false");
		}

	}
}