public class Game{

	String result;
	String endGameResult;
	int randomNum;
	
	double playerOne = 0;
	double playerTwo = 0;
	
	public String getRoundResult(){
	String[] player1Array;

	RPS player1 = new RPS();
	player1Array = new String[3];
	
	player1Array[0] = player1.getRandomRPS();
	player1Array[1] = player1.getRandomRPS();
	player1Array[2] = player1.getRandomRPS();
	
	String[] player2Array;
	
	RPS player2 = new RPS();
	player2Array = new String[3];
	
	player2Array[0] = player2.getRandomRPS();
	player2Array[1] = player2.getRandomRPS();
	player2Array[2] = player2.getRandomRPS();

	randomNum = (int)(Math.random() * player2Array.length);

	if(player1Array[randomNum] == "Rock" && player2Array[randomNum] == "Scissors"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
		playerOne++;
	}
	if(player1Array[randomNum] == "Rock" && player2Array[randomNum] == "Paper"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
		playerTwo++;
	}
	if (player1Array[randomNum] == "Rock" && player2Array[randomNum] == "Rock"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
	}
	if (player1Array[randomNum] == "Paper" && player2Array[randomNum] == "Scissors"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
		playerTwo++;
	}
	if (player1Array[randomNum] == "Paper" && player2Array[randomNum] == "Paper") {
		result = player1Array[randomNum] + " " + player2Array[randomNum];
	}
	if (player1Array[randomNum] == "Paper" && player2Array[randomNum] == "Rock"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
		playerOne++;
	}
	if (player1Array[randomNum] == "Scissors" && player2Array[randomNum] == "Scissors"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
	}
	if (player1Array[randomNum] == "Scissors" && player2Array[randomNum] == "Paper"){
		result =  player1Array[randomNum] + " " + player2Array[randomNum];
		playerOne++;
	} 
	if (player1Array[randomNum] == "Scissors" && player2Array[randomNum] == "Rock"){
		result = player1Array[randomNum] + " " + player2Array[randomNum];
		playerTwo++;
	}
	return result;
	}
	

	public String getGameResult(){

	if ( playerOne > playerTwo){
		endGameResult ="Player one wins";
		}
	if ( playerOne < playerTwo) {
		endGameResult ="Player two wins";
		}
	if (playerOne == playerTwo) {
		endGameResult ="Tie";
		}
	return endGameResult;
	}
	

}