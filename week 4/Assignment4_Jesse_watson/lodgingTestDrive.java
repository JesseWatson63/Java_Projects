class lodgingTestDrive{
	public static void main (String[] args){
	
	Lodging a = new Lodging();
	//you must set 1 for $300 a night and 2 for $100 a night
	a.setdailyLodgePrice(2);
	//enter amount of nights you would like to stay.
	a.setdaysLodge(3);
	
	a.vacation();
	}
}