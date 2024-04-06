package chessAttempt;

public class Pawn extends Pieces {
	String team;
	int xLoc, yLoc, value;
	
	public Pawn(String team, int xLoc, Pieces[][] board) {
		value = 1;
		
		this.team = team;
		this.xLoc = xLoc;
		
		if (team.equals("White")) {
			yLoc = 6;
		} else {
			yLoc = 1;
		}
		
		board[yLoc][xLoc] = this;
		
		currentLocation(xLoc, yLoc);
	}

	public String toString() {
		if (team.equals("White")) {
			return " I ";
		} else return " i ";
	}
	
	
	//The amount of spaces a piece is allowed to move
	//The direction a piece is allowed to move
	public void moveSet() {
		
	}
	
	//Move the piece from one location to another
	//check if the move is legal w/ the moveSet() method
	//
	public boolean movePiece(int posOneX, int posOneY, int posTwoX, int posTwoY, Pieces[][] board) {
		Pieces[][] tempBoard = new Pieces[8][8];
		if ((posOneX - posTwoX) != 1 || (posOneX - posTwoX) != -1) {
			return false;
		} else {
			tempBoard[posTwoY][posTwoX] = board[posTwoX][posTwoY];
			
			if (board[posTwoY][posTwoX].equals("   ")) {
				board[posTwoY][posTwoX] = board[posOneY][posOneX];
				board[posOneY][posOneX] = board [posTwoY][posTwoX];
				return true;
			} else {
				return false;
			}
		}
	}
	
	//Check the spaces surrounding the piece
	public void nextTo() {
		
	}
	
	//Store the current location in the 2D array of the piece
	public void currentLocation(int xLoc, int yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
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
