package bnz;

public class GameEngine {

	// this method displays the board
	public static void Display(String[] args) {
		GameBoard World = new GameBoard();
		World.displayBoard();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GameEngine app = new GameEngine();

	}
}
