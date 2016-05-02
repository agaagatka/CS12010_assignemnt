package bnz;

import java.util.Random;

public abstract class Creature implements Being {

	String name;
	Position pos;
	GameBoard gameBoard;

	public void setName(String Name) {
		Name = name;
	}
	
	public String getName() {
		return name;
	}

	public void move(Position position) {
		gameBoard.moveCreature(this, this.pos, position);
		this.setLocation(position);
	}

	// This is a function that creates movement.

	public void move(Direction direction) {
		WhereToMoveTo moveChecker = new WhereToMoveTo(20, 20);

		if (moveChecker.checkCanMove(this.pos, direction)) {
			Position newPos = moveChecker.getMovePosition(this.pos, direction);
			gameBoard.moveCreature(this, this.pos, newPos);
			this.setLocation(newPos);
		} else {
			System.out.println("This move can't be done");
		}
	}
	// Then it checks if it can go in the direction, then if it can, it will get
	// and then on the board,
	// if it can it will change to a new position

	public void moveRandom() {
		boolean moved = false;
		while (!moved) {
			int pick = new Random().nextInt(Direction.values().length);
			if (canMove(Direction.values()[pick])) {
				move(this.getMoveLocation(Direction.values()[pick]));
				moved = true;
			}
		}
	}

	private Direction getMoveLocation(Direction direction) {
		Position location = new Position();
		int x = this.getLocation().getColumnValue();
		int y = this.getLocation().getRowValue();

		// need to add break

		switch (direction) {
		case N:
			y--;
			break;
		case E:
			x++;
			break;
		case S:
			y++;
			break;
		case W:
			x--;
			break;
		case NE:
			y--;
			x++;
			break;
		case NW:
			y--;
			x--;
			break;
		case SE:
			y++;
			x++;
			break;
		case SW:
			y++;
			y--;
			break;
		case C:
			break;
		}
		location.setColumnValue(y);
		location.setRowValue(x);

		return null;
	}

	private boolean canMove(Direction direction) {
		if ((direction == Direction.N || direction == Direction.NE || direction == Direction.NW)
				&& (this.pos.getY() <= 0)) {
			return false;
		}

		if ((direction == Direction.E || direction == Direction.NE || direction == Direction.SE)
				&& (this.pos.getX() >= 19)) {
			return false;
		}
		if ((direction == Direction.S || direction == Direction.SE || direction == Direction.SW)
				&& (this.pos.getY() >= 19)) {
			return false;
		}
		if ((direction == Direction.W || direction == Direction.NW || direction == Direction.SW)
				&& (this.pos.getX() <= 0)) {
			return false;
		}

		return true;
	}
}
