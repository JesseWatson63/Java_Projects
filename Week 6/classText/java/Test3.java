import java.text.NumberFormat;
public class Test3{

	public static void main(String[] args){

	//test 1
	Consultant c=new Consultant("Mike");
	Consultant d=new Consultant("Susan","S");
	Consultant e=new Consultant("Jeremy");
	Project p=new Project("Acme, Inc.", 100, c,d);
	Consultant f=c;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
  
	System.out.println("Expense (w/Susan): " + nf.format(p.calculateExpense()));
	
	p.removeConsultant(d);

	System.out.println("Expense (w/o Susan): " + nf.format(p.calculateExpense()));
	p.addConsultant(e);
	System.out.println("Expense (w Jeremy): " + nf.format(p.calculateExpense()));
	
	System.out.println("Is Mike on the job?: " + p.isOnProject(c));
	System.out.println("Is Susan on the job?: " + p.isOnProject(d));
	System.out.println("Is Other Mike on the job?: " + p.isOnProject(f));
	
	}

}