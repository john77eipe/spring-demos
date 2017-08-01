package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//
// Car manufacturing area
//
@Component("car")
public class Car {
	
	private Engine engine;
	
	Car() {
	}

	Car(Engine engine) {
		this.engine = engine;
	}

	public void startCar() {
		engine.start();
	}
	
	@Autowired
	@Qualifier("petrol")
	public void setEngine(Engine engine){
		this.engine = engine;
	}
}