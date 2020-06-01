package snackBarApp;

public class Main {
	private static void workWithData() {
		Customer customer1 = new Customer("Jane", 45.25);
		Customer customer2 = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack snack1 = new Snack("Chips", 36, 1.75, food.getId());
		Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack snack3 = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack snack4 = new Snack("Soda", 24, 2.50, drink.getId());
		Snack snack5 = new Snack("Water", 20, 2.75, drink.getId());
	}

	public static void main(String[] args) {
		workWithData();
	}
}
