
public class Mobil extends Kendaraan {

	private String typecar;
	private Integer entertainment;

	public Mobil(String tipe, String brand, String name, String license, Integer speed, Integer gas, Integer wheel, String typecar, Integer entertainment) {
		super(tipe, brand, name, license, speed, gas, wheel);
		this.typecar = typecar;
		this.entertainment = entertainment;
	}

	public String getTypecar() {
		return typecar;
	}

	public Integer getEntertainment() {
		return entertainment;
	}
	
	public void turnon() {
		System.out.println("Brand: " + brand);
		System.out.println("Nama: " + name);
		System.out.println("License Plate: " + license);
		System.out.println("Type: " + typecar);
		System.out.println("Gas Capacity: " + gas);
		System.out.println("Top Speed: " + speed);
		System.out.println("Wheel(s): " + wheel);
		System.out.println("Entertainment System: " + entertainment);
		System.out.println("Turning on entertainment system...");
		if(typecar.equals("Supercar")) {
			System.out.println("Boosting!");
		}
		
	}
	
	
	

}
