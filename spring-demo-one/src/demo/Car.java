package demo;
//
// Car manufacturing area
//

public class Car {
	private Engine engine;

	Car(Engine engine) {
		this.engine = engine;
	}

	public void startCar() {
		engine.start();
	}
}