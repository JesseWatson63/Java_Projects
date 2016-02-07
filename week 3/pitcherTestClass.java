public class pitcherTestClass {
	
	public static void main(String[] args){
	//test for a 64oz. pitcher
	
		pitcher p=new pitcher(); 
	
		p.setVolumeInOunces(64.0d);
	
		System.out.println("Servings =" + " " + p.getSevings());
		System.out.println("Scoops =" + " " + p.getScoops());
	}

}