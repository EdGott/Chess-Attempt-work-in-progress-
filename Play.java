package chessAttempt;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Play {
	
	public static Board gameBoard = new Board();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int numPlayers, playerTurn = 1;
		boolean winner = false, validNum = false;
		
		System.out.println("Welcome to scuffed as fuck chess!");
		
		do {
			try {

				System.out.println("Side note: currently there is no chess AI in place, therefore the only option is two players.");
				System.out.print("How many people are going to be playing today? (1 or 2): ");
				
				numPlayers = in.nextInt();
				in.nextLine();
				System.out.println();
				
				if (numPlayers < 1 || numPlayers > 2) {
					System.out.println("It appears that your input is invalid.\nPlease input '1' or '2' to play.\n");
					validNum = false;
				}
				
				if (numPlayers == 1) {
					System.out.println("You will be Uppercase (White)\n");
					validNum = true;
				} else if (numPlayers == 2) {
					System.out.println("Player 1 will be Uppercase (White) and player 2 will be Lowercase (Black)\n");
					validNum = true;
				}
			} catch (InputMismatchException iME) {
				System.out.print("\nIt appears that your input is invalid.\nPlease input '1' or '2' to play.\n\n");
				in.nextLine();
				validNum = false;
			}
		} while (validNum == false);
		
		gameBoard.printBoard();
		
		
		while (winner != true) {
			
			if (playerTurn >= 3) {
				playerTurn = 1;
			}
			
			String playerMove;
			
			System.out.print("Player " + playerTurn + " please make your move (E.g. G1 F3 [Move G1 to F3]): ");
			playerMove = in.nextLine();
			System.out.println();
			
			movePiece(playerMove);
			
			playerTurn++;
			
			gameBoard.printBoard();
		}
		in.close();
	}
	
	
	public static void movePiece(String playerMove) {
		int posOneX, posOneY, posTwoX, posTwoY;
		
		String[] move = new String[2];
		
		move = playerMove.split(" ");
		
		posOneX = getNumFromLet(move[0].charAt(0));
		posOneY = Character.getNumericValue(move[0].charAt(1)) - 1;
		
		posTwoX = getNumFromLet(move[1].charAt(0));
		posTwoY = Character.getNumericValue(move[1].charAt(1)) - 1;
		
		gameBoard = gameBoard.updateBoard(posOneX, posOneY, posTwoX, posTwoY, gameBoard /*gameBoard.board*/);
		
		System.out.println(Arrays.toString(move));
	}

	
	public static int getNumFromLet(char c) {
		
		String letter = String.valueOf(c).toLowerCase();
		
		if (letter.equals("a")) {
			return 0;
		} else if (letter.equals("b")) {
			return 1;
		} else if (letter.equals("c")) {
			return 2;
		} else if (letter.equals("d")) {
			return 3;
		} else if (letter.equals("e")) {
			return 4;
		} else if (letter.equals("f")) {
			return 5;
		} else if (letter.equals("g")) {
			return 6;
		} else if (letter.equals("h")) {
			return 7;
		} else return -1;
	}
}
