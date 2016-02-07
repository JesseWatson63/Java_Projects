public class Test1 {

	public static void main(String[] args){
		
		Student s=new InCounty();
		System.out.println("Student 10 hrs: " + s.calcTuition(10));
		
		s=new OutCounty();
		System.out.println("Student 10 hrs: " + s.calcTuition(10));
		
		s=new OutState();
		System.out.println("Student 10 hrs: " + s.calcTuition(10));
		
	}
}