class Student {
	
	double tuition;
	double hours;
	double labCost;
	
	String lectureType;
	String labFee;
	public void setTuition(double t){
		if (t == 1) {
			tuition = 200;
		} else {
			tuition = 400 ;
		}
	}
	
	
	public void setLecture(double l) {
		if (l == 1) {
			hours = 3;
			lectureType = "lecture  and " + (int)hours + " hours in a class room";
		
		} else {
			hours = 4;
			lectureType = "lecture + lab and " + (int)hours + " in class and lab";
		}
	}
	
	
	public void setLabCost(double m) {
		if (m == 1) {
			labCost = 50;
			labFee = " lab will cost " + labCost;
		} else {
			labFee = "Goodbye";
		}
	}

	
	
	
	
	void finalResult() {
	System.out.println(lectureType);
	System.out.println(tuition);
	System.out.println(labFee);
	}
}