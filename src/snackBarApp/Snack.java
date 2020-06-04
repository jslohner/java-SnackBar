package snackBarApp;

public class Snack {
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// get methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public int getVendingMachineId() {
		return vendingMachineId;
	}

	// set methods
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	// other methods
	public void addToQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void snacksBought(int numOfSnacksBought) {
		this.quantity = this.quantity - numOfSnacksBought;
	}

	public double getTotalCost(int totalNumOfItems) {
		return this.cost * totalNumOfItems;
	}
}
