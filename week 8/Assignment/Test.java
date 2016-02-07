public class Test {
	public static void main(String[] args) {
	
		Course class1 = new Course();
		Lab lab1 = new Lab();
		Student Student1 = new Student();
		
		class1.setHours(1);
		lab1.setLab("yes");
		Student1.setRate(400);
		
		System.out.println(class1.getHours());
		System.out.println(lab1.getLab());
		System.out.println(Student1.calcTuition());
	}
}