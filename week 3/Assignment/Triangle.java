public class Triangle {

	String triangle;
	int e;
	
	public String triangle(int a, int b, int c) {
	
		if(a > 0 && b > 0 && c > 0) {
			triangle = ("is triangle ");
		 if( a == b || a == c || b == c) {
			triangle = ( triangle + "and is also an Isosceles");
		 if( a == b && a == c && b == c)  {
			triangle =( triangle + "and is also an equilateral ");
		} } } else {
			triangle = ("I do not know what it is");
		}
		return triangle;
	}
	

	


}
	
	
	
