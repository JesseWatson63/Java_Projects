import java.util.Scanner;		
class StudentTestDrive{
	public static void main (String[] args) {
	
			int s;
			
			Scanner in = new Scanner(System.in);
			Student a = new Student();
			System.out.println("What kind course would you like to take?");
			System.out.println("Enter 1 for lab only or 2 for lecture and lab");
			s = in.nextInt();
			if (s == 1) {
			a.setTuition(1);
			} else {
			a.setTuition(2);
			}
			
			
			

	}
}