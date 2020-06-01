package snackBarApp;

public class Customer {
	private int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// get methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	// set methods
	public void setName(String name) {
		this.name = name;
	}

	// other methods
	public void addToCashOnHand(double addedCash) {
		this.cashOnHand = this.cashOnHand + addedCash;
	}

	public void buySnacks(double spentCash) {
		this.cashOnHand = this.cashOnHand - spentCash;
	}
}
