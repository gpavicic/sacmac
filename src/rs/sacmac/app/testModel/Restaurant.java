package  rs.sacmac.app.testModel;

import java.util.List;

public class Restaurant {

	private IHotDrink hotDrink;
	private IHotMeal hotCheese;
	private List restaurantWaitressList;
	
	public Restaurant() {		
	}

	public Restaurant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	
	public Restaurant(IHotDrink hotDrink, List restaurantWaitressList) {
		this.hotDrink = hotDrink;
		this.restaurantWaitressList =restaurantWaitressList;
	}

	public IHotMeal getHotCheese() {
		return hotCheese;
	}

	public void setHotCheese(IHotMeal hotCheese) {
		this.hotCheese = hotCheese;
	}
	

	public List getRestaurantWaitressList() {
		return restaurantWaitressList;
	}

	public void setRestaurantWaitressList(List restaurantWaitressList) {
		this.restaurantWaitressList = restaurantWaitressList;
	}

	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();

	}
	
	public void prepareHotCheese() {
		hotCheese.prepareHotMeal();
		
	}
	public void displayWaitressNames(){
		System.out.println("All waitress" + restaurantWaitressList);
	}

}
