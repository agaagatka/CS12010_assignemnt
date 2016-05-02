package bnz;

import java.util.Random;

public class Position {

	private int columnValue;
	private int rowValue;

	// Below we create the constructor

	public Position() {
		columnValue = 1;
		rowValue = 1;
	}

	// contructor for position - x for colunm, y for value

	public Position(int X, int Y) {
		columnValue = X;
		rowValue = Y;
	}

	// setter and getter for column value

	public int getColumnValue() {
		return columnValue;
	}

	public void setColumnValue(int columnValue) {
		this.columnValue = columnValue;
	}

	// setter and getter for row value

	public void setRowValue(int rowValue) {
		this.rowValue = rowValue;
	}

	public int getRowValue() {
		return rowValue;
	}

	// random position generator

	public void positionGenerator() {
		Random rn = new Random();
		int X = rn.nextInt(19) + 1;
		int Y = rn.nextInt(19) + 1;
		this.setRowValue(Y);
		this.setRowValue(X);

	}

	public int getY() {
		return 0;
	}

	public int getX() {
		return 0;
	}
}
