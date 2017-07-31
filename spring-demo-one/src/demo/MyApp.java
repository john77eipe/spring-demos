package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("myConfig.xml");
		
		
		Car c =  context.getBean("car", Car.class);
		c.startCar();
		
				
		// close the context
		context.close();
	}
}


