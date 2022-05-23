package que3;

public class Car {
	String model;
	String companyName;
	String color;
	
	Engine engine;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String model, String companyName, String color, Engine engine) {
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}

	public Car() {
	}
	
	
	
	
}
