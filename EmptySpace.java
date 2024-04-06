package chessAttempt;

public class EmptySpace extends Pieces {
	String team = "none";

	public EmptySpace(int xLoc, int yLoc, Pieces[][] board) {
		board[yLoc][xLoc] = this;
	}
	
	@Override
	public String toString() {
		return "   ";
	}

}
