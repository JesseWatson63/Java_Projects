public class Lab{
	int labFee = 0;
	String cost = " ";
	
	public void setLab(String answer){
		cost = answer;
	}
	
	public double getLab(){
	
		if(cost == "yes"){
			labFee = 50;
		}else{
			labFee = 0;
		}
		return labFee;
	}
}