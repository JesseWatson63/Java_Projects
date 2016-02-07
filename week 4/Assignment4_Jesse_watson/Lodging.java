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
	
	
	
	
	

	
	void vacation(){
		System.out.println(dailyLodgePrice);
		System.out.println(daysLodge);
		System.out.println(daysLodge * dailyLodgePrice);
	}

}