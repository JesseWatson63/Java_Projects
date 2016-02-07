class Specialist extends Consultant{

	private String specialty;

	Specialist(String argName){
		this.setName(argName);
		this.setType("R");
	}

	Specialist(String argName, String argType){
		this.setName(argName);
		this.setType(argType);
	}

	public void setSpecialty(String arg){
		specialty=arg;

	}

	public String getSpecialty(){
		return specialty;

	}

	//overrides super class
	public double getPayRate(){
		double result;

		result=super.getPayRate() * 1.5;
		

		return result;
	}





}