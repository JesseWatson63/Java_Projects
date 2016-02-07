import java.text.NumberFormat;
public class Test2{

	public static void main(String[] args){

	//test 1
	Consultant c=new Consultant("Mike");
	Consultant d;
	d=c;
	Project p=new Project("Acme, Inc.", 100, c);

	d.setType("S");
	NumberFormat nf = NumberFormat.getCurrencyInstance();
  
	System.out.println("Expense: " + nf.format(p.calculateExpense()));

	}

}