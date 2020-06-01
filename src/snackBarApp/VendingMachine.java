package snackBarApp;

public class VendingMachine {
	private static int maxId = 0;

	private int id;
	private String name;

	public VendingMachine(String name) {
		maxId++;
		id = maxId;
		this.name  = name;
	}

	// get methods
	public int getId(int id) {
		return id;
	}

	public String getName(String name) {
		return name;
	}

	// set methods
	public void setName(String name) {
		this.name = name;
	}
}
