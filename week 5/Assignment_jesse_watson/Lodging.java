class Lodging{
	
	double dailyLodgePrice;
	double daysLodge;
	double totalLodge;

	
	
	public double getdailyLodgePrice(){
		return dailyLodgePrice;
	}
	public double getdaysLodge(){
		return daysLodge;
	}
	
	
	
	
	public void setdailyLodgePrice(double s) {

		if(s == 1){
			dailyLodgePrice = 300;
		}else{
			dailyLodgePrice = 100;
		}
	}
	public void setdaysLodge(double t) {
		daysLodge = t;
	}	
	
	public double calculateHotel() {
		double hotelCost= 0;
		hotelCost = daysLodge * dailyLodgePrice;
		return hotelCost;
	}

	
	

	
	void vacation(){
		System.out.println("The cost for your hotel will be:");
		System.out.println("Each night will cost you $" + dailyLodgePrice);
		System.out.println("You have decided to stay for " + daysLodge + " days");
		System.out.println("The cost of your hotel for " + daysLodge + " days will be $" + calculateHotel());

	}

}