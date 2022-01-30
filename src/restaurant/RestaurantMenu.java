package restaurant;

public class RestaurantMenu {
	String item;
	double priceForItem;

	public RestaurantMenu() {
		// TODO Auto-generated constructor stub
		System.out.println("Please see the Restaurant Menu");
	}

	public RestaurantMenu(String item, double priceForItem) {
		this.item = item;
		this.priceForItem = priceForItem;
	}

	void showMenu(String itemName, double itemPrice) {
		System.out.println(itemName + "     " + itemPrice);
	}

}
