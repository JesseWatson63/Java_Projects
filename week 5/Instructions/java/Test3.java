import java.text.NumberFormat;
public class Test3{

	public static void main(String[] args){

	//test 1
	Consultant c=new Consultant("Mike");
	Consultant d=new Consultant("Susan","S");
	
	Project p=new Project("Acme, Inc.", 100, c,d);

	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
  
	System.out.println("Expense: " + nf.format(p.calculateExpense()));

	}

}