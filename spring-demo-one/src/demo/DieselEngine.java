package demo;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine {
	@Override
	public void start() {
		System.out.println("diesel engine starts");
	}
}
