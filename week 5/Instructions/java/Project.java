public class Project{

	private String customer;
	private double hours;
	private Consultant c;

	Project(String argCust, double argHours, Consultant argC){
		customer=argCust;
		hours=argHours;
		c=argC;

	}

	public double calculateRevenue(){
		double result;

		result=hours * c.getBillRate();

		return result;
	}

	public double calculateExpense(){
		double result;

		result=hours * c.getPayRate();

		return result;
	}
	public double calculateMargin(){
		double result;

		result=this.calculateRevenue() - this.calculateExpense();

		return result;
	}
}