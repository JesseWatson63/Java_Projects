import java.util.ArrayList;

public class Student {
	
	double cost = 0;
	double hours = 0;
	double tuition = 0;

	ArrayList<String> classes = new ArrayList<String> ();
	
	
	public void setRate(double Rate){
		cost = Rate;
	}
	
	public double getRate(){
		return cost;
	}
	
	
	public double calculateHours(){
		return hours;
	}

	
	public double calcTuition(){
		tuition = classCost;
		return tuition;
	}
	
}