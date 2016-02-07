import java.util.ArrayList; 

public class Project{

	private String customer;
	private double hours;
	private ArrayList c=new ArrayList();

	Project(String argCust, double argHours, Consultant argC){
		customer=argCust;
		hours=argHours;
		c.add(argC);

	}
	Project(String argCust, double argHours, Consultant argC, Consultant argC2){
		customer=argCust;
		hours=argHours;
		c.add(argC);
		c.add(argC2);
	}

	public double calculateRevenue(){
		double result;
		Consultant x;
		result=0;
		 for (int i=0;i<c.size();i++){
				//x=c.get(i);
				x=(Consultant)c.get(i);
				result=result + hours * x.getBillRate();
		}	

		return result;
	}

	public double calculateExpense(){
		double result;
		Consultant x;
		result=0;
		 for (int i=0;i<c.size();i++){
				//x=c.get(i);
				x=(Consultant)c.get(i);
				result=result + hours * x.getPayRate();
		}	

		return result;
	}
	public double calculateMargin(){
		double result;

		result=this.calculateRevenue()-this.calculateExpense();
			

		return result;
	}

	public void removeConsultant(Consultant arg){
		c.remove(arg);

	}

	public void addConsultant(Consultant arg){
		c.add(arg);

	}

	public boolean isOnProject(Consultant arg){
		return c.contains(arg);

	}	


}