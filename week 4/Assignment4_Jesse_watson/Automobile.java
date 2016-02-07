class Automobile {

	private double MPG;
	private double TankSize;
	private double FillUp = 0;
	private double gasPrice = 3.50;
	private double distance;
	private double tripCost;
	
	
	
	
		public double getMpg() {
			return MPG;
		}
		public double getTankSize() {
			return TankSize;
		}
		public double getDistance() {
			return distance;
		}
		public void setMPG(double s) {
			MPG = s;
		}
		public void setTankSize(double t){
			TankSize = t;
		}
		public void setDistance(double d) {
			distance = d;
		}
		

		
		double CalculateFillUpCost(){
			FillUp = gasPrice * TankSize;
			return FillUp;
		}
		double CalculateTripCost() {
			tripCost = (distance/MPG) * gasPrice;
			return tripCost;
		}
		
		
		
		
		void FinalResult() {
			System.out.println("Fill up cost at $3.50 a gallon will be $" + CalculateFillUpCost());
			System.out.println("This trip of " + distance + " miles will cost you $" + CalculateTripCost());
			System.out.println("..........................");
		}
	
}