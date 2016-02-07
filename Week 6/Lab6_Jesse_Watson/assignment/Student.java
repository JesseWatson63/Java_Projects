class Student {
	int tuition;
	int labCost;
	
	public void setTuition(double t){
		if (t == 1) {
			tuition = 200;
				System.out.print("Thats a fine choice and The price will be $");
				System.out.print( tuition );
				System.out.println("That will be a 3 hour course.");
				
		} else {
			tuition = 400 ;
			labCost = 50;
				System.out.print("Thats a fine choice and The price will be $");
				System.out.println( tuition );
				System.out.println("That will be a 2 hour course and 2 hour lab.");
		}
	}
	
	
	

}