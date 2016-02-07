public abstract class Student{
	
	public double calcTuition(int argHrs){
		double tuition;
		
		if(argHrs < 13){
			tuition = getRate() * argHrs;
		} else {
			if (argHrs < 19){
			tuition = getRate() * 13;
		} else {
		tuition=getRate() * (argHrs * 5);
			}
		}
		return tuition;
	}
	public abstract double getRate();
}