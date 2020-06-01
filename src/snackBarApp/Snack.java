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

	// public void setQuantity(int quantity) {
	// 	this.quantity = quantity;
	// }

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	// other methods
	// public void addToQuantity(int quantity) {
	// 	this.quantity = this.quantity + quantity;
	// }


}

// ### Snack
//
// Snack has fields (so knows)
//
// * maxId - keep track of last used snack id
// * id - automatically generated field
// * name
// * quantity
// * cost
// * vending machine id
//
// Snack has methods (so can)
//
// * get id
// * set and get name
// * set and get cost
// * set and get vending machine id
// * get quantity
// * add quantity when given how many to add
// * buy snack when given how many to buy
// * get total cost given a quantity
