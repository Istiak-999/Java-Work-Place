package hotel;

public class Room {
	private int roomnumber;
	private String type;

	public Room() {
	}

	public Room(int roomnumber, String type) {
		this.roomnumber = roomnumber;
		this.type = type;

	}

	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		// ternary operator
		return "[" + this.getRoomnumber() + "," + this.getType() + "]";
	}

	public void cal() {

	}
}
