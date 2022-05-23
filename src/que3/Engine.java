package que3;

public class Engine {
	
	int rmp;
	int power;
	String manufacturer;
	boolean hasTurbo;
	
	public void enableTurbo() {
		this.hasTurbo=true;
	}

	public Engine(int rmp, int power, String manufacturer, boolean hasTurbo) {
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
	
}
