public class pitcher {
	
	private double VolumeInOunces;
	
	public void setVolumeInOunces(double arg){
		VolumeInOunces = arg;
	}
	
	public double getVolumeInOunces(){
		return VolumeInOunces;
	}
	
	
	public double getSevings(){
		double results;
		results=VolumeInOunces / 8;
		return results;
	}
	
	public double getScoops(){
		double results;
		results=VolumeInOunces / 16;
		return results; 
	}

}