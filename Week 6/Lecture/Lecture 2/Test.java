public class Test{

	public static void main(String[] args){
	
		Painted p=new Automobile();
		
		System.out.println("Type of paint: " + p.getPaint());
		System.out.println("How long: " + p.avgPaintTime());
		
		Painted p2 = new House("S");
		
		System.out.println("Type of paint: " + p2.getPaint());
		System.out.println("How long: " + p2.avgPaintTime());
		
	}
}