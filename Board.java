package chessAttempt;

public class Board {
	
	Pieces[][] board = new Pieces[8][8];
	

	public Board() {
		setUpBoard();
	}
	
	public void setUpBoard() {
		//Set up blank spaces
		for (int y = 2; y < 6; y++) {
			for (int x = 0; x < 8; x++) {
				new EmptySpace(x, y, board);
			}
		}
		
		//Set up actual pieces
		for (int i = 0; i < 8; i++) {
			new Pawn("Black", i, board);
			new Pawn("White", i, board);
			
			if (i == 4) {
				new King("Black", i, board);
				new King("White", i, board);
			}
			
			if (i == 3) {
				new Queen("Black", i, board);
				new Queen("White", i, board);
			}
			
			if (i == 2 || i == 5) {
				new Bishop("Black", i, board);
				new Bishop("White", i, board);
			}
			
			if (i == 0 || i == 7) {
				new Rook("Black", i, board);
				new Rook("White", i, board);
			}
			
			if (i == 1 || i == 6) {
				new Knight("Black", i, board);
				new Knight("White", i, board);
			}
			
		}
	}
	
	public Board updateBoard(int moveLocOneX, int moveLocOneY, int moveLocTwoX, int moveLocTwoY, Board oldBoard/*Pieces[][] oldBoard*/) {
		
		System.out.println("OneX " + moveLocOneX + "\n" + "OneY " + moveLocOneY + "\n" + "TwoX " + moveLocTwoX + "\n" + "TwoY " + moveLocTwoY);
		
		Pieces pieceOne = oldBoard.board[moveLocOneY][moveLocOneX];
		Pieces pieceTwo = oldBoard.board[moveLocTwoY][moveLocTwoX];
		
		if (pieceOne.compareTo(pieceTwo) > 0) {
			// Same team.
			// Will need to throw an error and tell the user that they cannot move there for their own piece
			// is currently occupying the location.
			// Therefore every move will have to be on a conditional loop
			return null;
		} else if (pieceOne.compareTo(pieceTwo) <= 0) {
			// Different team
			// Will have to then replace the piece that is occupying the coordinates with the new piece.
			this.board[moveLocTwoY][moveLocTwoX] = board[moveLocOneY][moveLocOneX];
			this.board[moveLocOneY][moveLocTwoX] = new EmptySpace(moveLocOneY, moveLocOneX, this.board);
		}
				
		return this;

	}
			
	
	//8x8
	public void printBoard() {
		int row = 1;

		System.out.println("    A   B   C   D   E   F   G   H");
		System.out.println("  ---------------------------------");
		for (int i = 0; i < 8; i++) {
			for (int y = 0; y < 8; y++) {
				if (y == 0) {
					System.out.print(row + " ");
					row++;
				}
				if (y != 7) {
					System.out.print("|" + board[i][y]);
				} else {
					System.out.println("|" + board[i][y] + "|");
				}
			}
			System.out.println("  ---------------------------------");
		}

		
	}

}
