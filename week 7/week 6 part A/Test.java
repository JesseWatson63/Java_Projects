class Test{
	public static void main (String[] args) {
	
		Student a1 = new Student();
			System.out.println("Your lab fee will be " + a1.setLabCost(1));
			System.out.println("Your Lecture hours will be " + a1.setLecture(1));
			System.out.println("Your tuition will be " + a1.setTuition(1));
			System.out.println("--------------------------------------");
			
		Student a = new John();
			System.out.println("Your lab fee will be " + a.setLabCost());
			System.out.println("Your Lecture hours will be " + a.setLecture());
			System.out.println("Your tuition will be " + a.setTuition());
			System.out.println("--------------------------------------");
		Student a2 = new Student();
			System.out.println("Your lab fee will be " + a2.setLabCost(0));
			System.out.println("Your Lecture hours will be " + a2.setLecture(0));
			System.out.println("Your tuition will be " + a2.setTuition(0));
			System.out.println("--------------------------------------");
		Student a3 = new Student();
			System.out.println("Your lab fee will be " + a3.setLabCost(1));
			System.out.println("Your Lecture hours will be " + a3.setLecture(0));
			System.out.println("Your tuition will be " + a3.setTuition(0));
			
	}
}