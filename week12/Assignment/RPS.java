public class RPS {
	String playerName;
	
	
	public void setPlayerName(String n){
		playerName = n;
	}
	public String getPlayerName(){
		return playerName;
	}
	
	public String getRandomRPS(){
		String resultRPS;
		double randomNum;
		randomNum = (int) (Math.random() * 4 );
			if(randomNum == 1){
				resultRPS = "Rock";
			}else if (randomNum == 2){
				resultRPS = "Paper";
			}else{
				resultRPS = "Scissors";
			}
			return resultRPS;
	}
}