import javax.swing.JOptionPane;

public class Test {
	public static void main (String[] arg){
		
		String pOne = JOptionPane.showInputDialog("Enter First Name");
		String pTwo = JOptionPane.showInputDialog("Enter First Name");
		
		RPS player1 = new RPS();
		RPS player2 = new RPS();

		player1.setPlayerName(pOne);
		player2.setPlayerName(pTwo);
		
		JOptionPane.showMessageDialog(null, player1.getPlayerName() + " VS. " + player2.getPlayerName(), "The competitors", JOptionPane.PLAIN_MESSAGE);
		
		Game round1 = new Game();
		//System.out.println("Round 1");
		//System.out.println(round1.getRoundResult());
		//System.out.println(round1.getGameResult());
		JOptionPane.showMessageDialog(null,round1.getRoundResult(), "Round 1 Results", JOptionPane.PLAIN_MESSAGE);
		
		//System.out.println("");
		
		Game round2 = new Game();
		//System.out.println("Round 2");
		//System.out.println(round2.getRoundResult());
		//System.out.println(round2.getGameResult());
		JOptionPane.showMessageDialog(null, round2.getRoundResult(), "Round 2 Results", JOptionPane.PLAIN_MESSAGE);
		//System.out.println("");
		
		Game round3 = new Game();
		//System.out.println("Round 3");
		//System.out.println(round3.getRoundResult());
		//System.out.println(round3.getGameResult());
		JOptionPane.showMessageDialog(null, round3.getRoundResult() + " " + round3.getGameResult(), "Round 1 Results", JOptionPane.PLAIN_MESSAGE);
		//System.out.println("");
		//System.out.println("");
		//System.out.println("");
		
		

	}
}