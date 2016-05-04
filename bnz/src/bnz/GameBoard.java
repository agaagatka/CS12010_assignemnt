package bnz;

import java.util.Arrays;

public class GameBoard {

	// constructor for gameBoard

	private char[][] gameBoard;

	public GameBoard() {
		gameBoard = new char[20][20];

		for (int row = 0; row < gameBoard.length; row++) {
			Arrays.fill(gameBoard[row], ' ');

		}
	}
	// end of constructor

	// this method will display board to the screen

	public void displayBoard() {
		for (int row = 0; row < gameBoard.length; row++) {
			for (int col = 0; col < gameBoard.length; col++) {
				System.out.print(gameBoard[row][col]);

				if (col == 0 || col == 1)
					System.out.print("|     |     |     |     |     |     |     |     |     |");
			}
			System.out.print(
					"\n----------------------------------------------------------------------------------------------------------------\n");
		}
	}

	/**
	 * to create a new Bonk?????????????????????????????????
	 * 
	 * public void addBonk(Bonk bonk, Position pos){ Bonk B1 = new Bonk(null, 0,
	 * 0); //not sure about (null, 0, 0) above
	 * 
	 * gameBoard[pos.getColumnValue()][pos.getRowValue()].add(B1);
	 * B1.setLocation(pos);
	 * 
	 * }
	 */

	public void spawnEngine() {

		int numberOfBonks = 20;

		for (int B = 0; B < numberOfBonks; B++) {
			Position pos = new Position();
			pos.positionGenerator();
			Bonk bonk = new Bonk(null, B, B);
			// not sure again
			bonk.setLocation(pos);

			// adds it to the array

			// this.addBonk(bonk, pos);
		}
	}
	// moves the creature

	public void moveCreature(Creature creature, Position oldPos, Position newPos) {
	}

	// renaming the grid world to board

}
