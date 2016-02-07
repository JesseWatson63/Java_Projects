public class House implements Painted{
	
	String size;
	
	House(String argSize){
		size=argSize;
	}
	public String getPaint(){
		return "House Paint";
	}
	
	public double avgPaintTime(){
		
		double hrs;
		hrs=0;
		if(size == "S"){
			hrs=24;
		}
		if(size == "M"){
			hrs=32;
		}
		if(size == "L"){
			hrs=40;
		}
		return hrs;
		
	}


}