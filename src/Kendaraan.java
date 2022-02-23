
public abstract class Kendaraan {
	private String tipe;
	protected String brand;
	protected String name;
	protected String license;
	protected Integer speed;
	protected Integer gas;
	protected Integer wheel;


public Kendaraan(String tipe, String brand, String name,String license,Integer speed, Integer gas,Integer wheel) {
	this.tipe = tipe;
	this.brand = brand;
	this.name= name;
	this.license = license;
	this.speed = speed;
	this.gas = gas;
	this.wheel = wheel;
}


public String getTipe() {
	return tipe;
}


public String getBrand() {
	return brand;
}


public String getName() {
	return name;
}


public String getLicense() {
	return license;
}



public Integer getSpeed() {
	return speed;
}




public Integer getGas() {
	return gas;
}




public Integer getWheel() {
	return wheel;
}


public abstract void turnon();


}
