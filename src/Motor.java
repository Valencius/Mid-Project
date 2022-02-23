
public class Motor extends Kendaraan{
	
	private String typemotor;
	private Integer helm;

	public Motor(String tipe, String brand, String name, String license, Integer speed, Integer gas, Integer wheel, String typemotor, Integer helm) {
		super(tipe, brand, name, license, speed, gas, wheel);
		this.typemotor = typemotor;
		this.helm = helm;
	}

	@Override
	public void turnon() {
		System.out.println("Brand: " + brand);
		System.out.println("Nama: " + name);
		System.out.println("License Plate: " + license);
		System.out.println("Type: " + typemotor);
		System.out.println("Gas Capacity: " + gas);
		System.out.println("Top Speed: " + speed);
		System.out.println("Wheel(s): " + wheel);
		System.out.println("Helm: " + helm);
		System.out.println(name +" is standing!");
		
		}
		
	

	public String getTypemotor() {
		return typemotor;
	}

	public Integer getHelm() {
		return helm;
	}

}
