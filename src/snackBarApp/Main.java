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

		customer1.buySnacks(snack4.getTotalCost(3));
		System.out.println("Customer 1 cash on hand $" + customer1.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + snack4.getQuantity());

		System.out.println();

		customer1.buySnacks(snack3.getTotalCost(1));
		System.out.println("Customer 1 cash on hand $" + customer1.getCashOnHand());
		System.out.println("Quantity of snack 3 is " + snack3.getQuantity());

		System.out.println();

		customer2.buySnacks(snack4.getTotalCost(2));
		System.out.println("Customer 2 cash on hand $" + customer2.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + snack4.getQuantity());

		System.out.println();

		customer1.addToCashOnHand(10);
		System.out.println("Customer 1 cash on hand $" + customer1.getCashOnHand());

		System.out.println();

		customer1.buySnacks(snack2.getTotalCost(1));
		System.out.println("Customer 1 cash on hand $" + customer1.getCashOnHand());
		System.out.println("Quantity of snack 2 is " + snack2.getQuantity());

		System.out.println();

		snack3.addToQuantity(12);
		System.out.println("Quantity of snack 3 is " + snack3.getQuantity());

		System.out.println();

		customer2.buySnacks(snack3.getTotalCost(3));
		System.out.println("Customer 2 cash on hand $" + customer2.getCashOnHand());
		System.out.println("Quantity of snack 3 is " + snack3.getQuantity());
	}

	public static void main(String[] args) {
		workWithData();
	}
}
