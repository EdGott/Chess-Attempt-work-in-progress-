package chessAttempt;

public class Knight extends Pieces {
	String team;
	int xLoc, yLoc, value;

	public Knight(String team, int xLoc, Pieces[][] board) {
		value = 3;
		
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
			return " H ";
		} else return " h ";
	}
	
	//Make sure to #OVERRIDE
	//Compare two pieces to see if they're the same color/team
	public int compareTo() {
		return 0;
	}
	
	//The amount of spaces a piece is allowed to move
	//The direction a piece is allowed to move
	public void moveSet() {
		
	}
	
	//Move the piece from one location to another
	//check if the move is legal w/ the moveSet() method
	//
	public void movePiece() {
		
	}
	
	//Check the spaces surrounding the piece
	public void nextTo() {
		
	}
	
	//Store the current location in the 2D array of the piece
	public void currentLocation() {
		
	}
	
	//update the location of the piece by taking the last location, clearing it and making current location the updated location
	public void updateLocation() {
		
	}
	
	//Check to see if the move is legal
	//i.e. no pieces of the same color on the space attempting to move to
	//updateLocation() if move is legal
	public boolean isLegalMove() {
		return false;
	}

}
