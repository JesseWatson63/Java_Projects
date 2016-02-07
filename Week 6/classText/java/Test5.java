import java.text.NumberFormat;
public class Test5{

	public static void main(String[] args){

	//test 1
	Consultant c=new Consultant("Mike");
	Consultant d=new Consultant("Susan","S");
	Consultant e=new Specialist("Jeremy");

	
	d=e;

	
	Project p=new Project("Acme, Inc.", 100, d);
	
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
  
	System.out.println("Expense (w/Jeremy the specialist): " + nf.format(p.calculateExpense()));
	
	
	
	}

}