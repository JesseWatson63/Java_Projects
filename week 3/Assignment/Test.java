public class Test {
	public static void main (String[] args) {

		int[][] triArray = {
			{3,3,3},
			{4,5,4},
			{5,3,1},
			{3,5,4},
			{2,4,3}
			};

		int i = (int) (Math.random() * 5);
		int j = (int) (Math.random() * 5);	
		
		//This tests the array of triangles
		Triangle b = new Triangle();
		System.out.println("A shape with the sides of " + triArray[i][0] + " " + triArray[i][1] + " " + triArray[i][2]);
		System.out.println(b.triangle(triArray[i][0],triArray[i][1],triArray[i][2]));
		System.out.println("_____________________________________");
		
		//another test of the array
		Triangle c = new Triangle();
		System.out.println("A shape with the sides of " + triArray[j][0] + " " + triArray[j][1] + " " + triArray[j][2]);
		System.out.println(c.triangle(triArray[j][0],triArray[j][1],triArray[j][2]));
		System.out.println("_____________________________________");




		
	}
}