public class Consultant{

	private String name;
	private String type;

	
	Consultant(String argName){
		this.setName(argName);
		this.setType("R");
	}

	Consultant(String argName, String argType){
		this.setName(argName);
		this.setType(argType);
	}

	public void setName(String arg){
		name=arg;
	}

	public void setType(String arg){
		type=arg;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}

	public double getPayRate(){
		double result;
		result=0;
		if (this.getType()=="J"){
			result=20;
		}

		if (this.getType()=="R"){
			result=30;
		}

		if (this.getType()=="S"){
			result=40;
		}

		return result;
	}

	public double getBillRate(){
		double result;
		result=3 * this.getPayRate();
		return result;
	}

}