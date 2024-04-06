package chessAttempt;

public class King extends Pieces {
	String team;
	int xLoc, yLoc;

	public King(String team, int xLoc, Pieces[][] board) {
		this.team = team;
		this.xLoc = xLoc;
		
		if (team.equals("White")) {
			yLoc = 7;
		} else {
			yLoc = 0;
		}
		
		board[yLoc][xLoc] = this;
	}
	
	@Override
	public String toString() {
		if (team.equals("White")) {
			return " K ";
		} else return " k ";
	}

}
