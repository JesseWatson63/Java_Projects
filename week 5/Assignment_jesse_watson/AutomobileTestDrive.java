class AutomobileTestDrive {
	public static void main (String[] args) {
	Automobile a = new Automobile();
	
	//Set your vehicles MPG
	a.setMPG(30);
	//Set your vehicles tank size
	a.setTankSize(10);
	//Set the distance you will be travelling
	a.setDistance(300);
	//print final results
	a.FinalResult();
	
	
	/*Automobile a2 = new Automobile();
	a2.setMPG(22);
	a2.setTankSize(15);
	a2.setDistance(300);
	a2.FinalResult();
	*/
	

	
	Lodging c = new Lodging();
	//you must set 1 for $300 a night and 2 for $100 a night
	c.setdailyLodgePrice(1);
	//enter amount of nights you would like to stay.
	c.setdaysLodge(3);
	
	c.vacation();
	}
}