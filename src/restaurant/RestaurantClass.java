package restaurant;

public class RestaurantClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantMenu rMenu = new RestaurantMenu();
		RestaurantMenu restaurantMenu = new RestaurantMenu("Noodles", 6.99);
		RestaurantMenu restaurantMenu2 = new RestaurantMenu("Fried Rice", 7.99);
		restaurantMenu.showMenu(restaurantMenu.item, restaurantMenu.priceForItem);
		restaurantMenu2.showMenu(restaurantMenu2.item, restaurantMenu2.priceForItem);
	}

}
