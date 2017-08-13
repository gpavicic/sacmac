package rs.sacmac.app.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import rs.sacmac.app.testModel.Restaurant;

@Service
public class SacMacService {
	
	public  void getDrink() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		 
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.prepareHotDrink();
		
	}

}
