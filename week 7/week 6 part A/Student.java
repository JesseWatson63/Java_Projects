public class Student {
	
	double hours;
	double labCost;
	
	public double setTuition(double t){
		double tuition;
		if (t == 1) {
			tuition = 200;
		}else{
			tuition = 400 ;
		}
		return tuition;
	}
	
	public int setLecture(int l) {
		int hours;
		if (l == 1) {
			hours = 3;
		}else{
			hours = 4;
		}
		return hours;
	}

	public int setLabCost(int m) {
		int labFee = 0;
		
		if (m == 1) {
			labFee = 50;
		} 
		if (m == 0){ 
			labFee = 0;
		}
		return labFee;
	}

}