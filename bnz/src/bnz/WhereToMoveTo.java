package bnz;

import java.util.Random;

public class WhereToMoveTo {
	private int minX;
	private int minY;
	private int maxX;
	private int maxY;

	public WhereToMoveTo(int xmax, int ymax) {
		minX = 1;
		minY = 1;
		this.maxX = xmax;
		this.maxY = ymax;
	}

	public Direction getRandomDirection() {
		Random rn = new Random();
		int randomNumber = rn.nextInt(8) + 1;//8?
		return Direction.values()[randomNumber];
	}

	public Position getMovePosition(Position start, Direction direction) {
		if (checkCanMove(start, direction) == false) {
			System.out.println("Cannont move to this location!");
		} 
		
		else {
			switch (direction) {
			case N:
				minY(start);
			case E:
				addX(start);
			case S:
				addY(start);
			case W:
				minX(start);
			case NE:
				minY(start);
				addX(start);
			case NW:
				minY(start);
				minX(start);
			case SE:
				addY(start);
				addX(start);
			case SW:
				addY(start);
				minX(start);
			case C:
				break;
			default:
				break;
			}
		}
		return start;
	}

	public boolean checkCanMove(Position start, Direction direction) {
		switch (direction) {
		case N:
			return canMoveNorth(start);
		case E:
			return canMoveEast(start);
		case S:
			return canMoveSouth(start);
		case W:
			return canMoveWest(start);
		case NE:
			return canMoveNorthEast(start);
		case NW:
			return canMoveNorthWest(start);
		case SE:
			return canMoveSouthEast(start);
		case SW:
			return canMoveSouthWest(start);
		default:
			return false;
		}
	}
	// This is where we move right or left by adding or subtracting 1

	private void addX(Position start) {
		start.setRowValue(start.getRowValue() + 1);
	}

	private void minX(Position start) {
		start.setRowValue(start.getRowValue() - 1);
	}

	private void addY(Position start) {
		start.setColumnValue(start.getColumnValue() + 1);
	}

	private void minY(Position start) {
		start.setColumnValue(start.getColumnValue() - 1);
	}

	/**
	 * this function checks if it can move left or right, we do this by checking
	 * to see if the position is greater than the array size , if it is larger
	 * then we cannot move and we throw an exception
	 **/

	private boolean canMoveNorth(Position start) {
		if (start.getColumnValue() < minY) {
			return false;
		}
		return true;
	}

	private boolean canMoveSouth(Position start) {
		if (start.getColumnValue() > maxY) {
			return false;
		}
		return true;
	}

	private boolean canMoveEast(Position start) {
		if (start.getRowValue() > maxX) {
			return false;
		}
		return true;
	}

	private boolean canMoveWest(Position start) {
		if (start.getRowValue() < minX) {
			return false;
		}
		return true;
	}

	private boolean canMoveNorthWest(Position start) {
		if (canMoveNorth(start) && canMoveWest(start)) {
			return true;
		}
		return false;
	}

	private boolean canMoveNorthEast(Position start) {
		if (canMoveNorth(start) && canMoveEast(start)) {
			return true;
		}
		return false;
	}

	private boolean canMoveSouthWest(Position start) {
		if (canMoveSouth(start) && canMoveWest(start)) {
			return true;
		}
		return false;
	}

	private boolean canMoveSouthEast(Position start) {
		if (canMoveSouth(start) && canMoveEast(start)) {
			return true;
		}
		return false;
	}

}
