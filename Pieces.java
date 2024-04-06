package chessAttempt;

public class Pieces {
	String team = "none";
	int xLoc;
	
	public Pieces() {
	}

	@Override
	public String toString() {
		return "   ";
	}
	
	public int compareTo(Pieces pieceToCompare) {
		if (pieceToCompare.team.equals("none")) {
			return 0;
		} else if (this.team.equals(pieceToCompare.team)) {
			return 1;
		} else return -1;
	}
	
	
	
	
	

}
