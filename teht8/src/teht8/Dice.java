package teht8;

public class Dice extends Game{

	int[] playersPoints;
	int winner=-1;
	
	@Override
	void initializeGame() {
		playersPoints = new int[playersCount];
	}

	@Override
	void makePlay(int player) {
		playersPoints[player]+=(int)(Math.random()*6.0+1);
		if(playersPoints[player]>100)
			winner=player;
	}

	@Override
	boolean endOfGame() {
		if(winner!=-1)
			return true;
		else
			return false;
	}

	@Override
	void printWinner() {
		System.out.println("PLAUER NRO: "+winner+" IS THE WINNER!!!!!");
	}

}
