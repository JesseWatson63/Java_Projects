public class mpg{

	private String name;
	private String type;
	
	mpg(String argmpg){
	this.setMpg(argmpg);
	this.setType("R");
	}
	
	mpg(String argmpg, String argType){
	this.setMpg(argmpg);
	this.setType(argType);
	}

	public void setMpg(String arg){
		name=arg;
	}
	public void setType(String arg){
		type=arg;
	}
	public String getmpg(){
		return name;
	}
	public String gettankSize(){
		return type;
	}
	
	public double getTank(){
		double result;
		result=0;
		if (this.gettankSize()=="J"){
			result=10;
		}
		if (this.gettankSize()=="R"){
			result=20;
		}
		return result;
	}
	
	public double getFillUpCost(){
		double result;
		result = 3 * this.getTank();
		return result;
	}

}