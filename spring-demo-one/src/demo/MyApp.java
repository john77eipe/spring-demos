package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("demo")
public class MyApp {
	
	public static void main(String[] args) {
		
		 /* Spring IoC Without XML */
	    AnnotationConfigApplicationContext context
	        = new AnnotationConfigApplicationContext(MyApp.class);
		
		Car c =  context.getBean("car", Car.class);
		c.startCar();
		
		// close the context
		context.close();
	}
	
	@Bean(name="car",initMethod = "init", destroyMethod = "cleanup")
	public Car getCar(){
		return new Car();
	}
	
}


