package bnz;

public class Bonk implements Being {

	private int ID;
	private String position;
	private int gender;

	public Bonk(String pos, int name, int gen) {

		ID = name;
		position = pos;
		gender = gen;
	}

	public String getName() {
		return null;
	}

	public void act() throws CannotActException {

	}

	public Position getLocation() {
		return null;
	}

	public void setLocation(Position location) {
	}

	// setter and getter for bonk's ID

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

}

/**
 * 
 * public boolean Duplicate(){ if (pos1 = pos2 ) }
 * 
 */
