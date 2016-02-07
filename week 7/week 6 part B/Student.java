public class Student {
	
		int tuition=0;
		int hours=0;
		int labFee=0;
		int totalCost=0;
		
	public int setTuition(int t){

		if (t == 1) {
			tuition = 200;
		}else{
			tuition = 400 ;
		}
		return tuition;
	}
	
	public int setLecture(int l) {

		if (l == 1) {
			hours = 3;
		}else{
			hours = 4;
		}
		return hours;
	}

	public int setLabCost(int m) {

		if (m == 1) {
			labFee = 50;
		} 
		if (m == 0){ 
			labFee = 0;
		}
		return labFee;
	}
	
	public int getTotalCost(){

		totalCost = tuition + labFee;
		return totalCost;
	}
}
