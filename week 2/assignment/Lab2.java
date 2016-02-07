class Lab2 {
	public static void main(String[] args) {
		int base;
		int height;
		int area;
		int perimeter;
		
		base=(int) (Math.random() * 10);
		height=(int) (Math.random() * 10);
		
		area = areaCalc(base * height);
		perimeter = areaCalc(base + base + height + height);
		
		System.out.println("Rectangle:");
		System.out.println("Side 1:" + base);
		System.out.println("Side 2:" + height);
		System.out.println("area:" + area );
		System.out.println("Perimeter:" + perimeter);
		
		if((0 < base) && (base == height)){
		System.out.println("Square: true");
		}
		else{
		System.out.println("Square: false");
		}
	}	


	public static int areaCalc(int argF){
		int area;
		area = argF;
		return area;
		
	}
}