package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//
// Car manufacturing area
//
public class Car implements InitializingBean, DisposableBean {

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
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@PostConstruct
	public void postConstruction() {
		System.out.println("postConstruct");
	}

	@PreDestroy
	public void preDestruction() {
		System.out.println("preDestroy");
	}

	public void init() {
		System.out.println("init");
	}

	public void cleanup() {
		System.out.println("cleanup");
	}
}