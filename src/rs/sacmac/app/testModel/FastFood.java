/**
 * 
 */
package rs.sacmac.app.testModel;

/**
 * @author stenci
 *
 */
public class FastFood {

	IHotMeal hotMeal;

	public IHotMeal getHotMeal() {
		return hotMeal;
	}

	public void setHotMeal(IHotMeal hotMeal) {
		this.hotMeal = hotMeal;
	}

	public void prepareHotMeal() {
		hotMeal.prepareHotMeal();

	}
}
