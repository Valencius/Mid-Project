import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Mobil> listMobil = new ArrayList<Mobil>();
		ArrayList<Motor> listMotor = new ArrayList<Motor>();
		int menu;
		do {
			System.out.println("1. Input");
			System.out.println("2. View");
			menu = scan.nextInt(); 
			scan.nextLine();
			switch(menu) {
				case 1:
					String tipe, brand, nama, license,typecar,typemotor;
					int speed,gas,wheel,entertainment,flag = 0,helm,harga;
					int pick = 0;
					do {
						System.out.println("Input type [Car | Motorcycle] :");
						tipe = scan.nextLine();
						if(tipe.equals("Car")) {
							flag = 1;
							do {
								System.out.println("Input brand [>= 5] :");
								brand = scan.nextLine();
							}while(brand.length() < 5);
							do {
								System.out.println("Input name [>= 5] :");
								nama = scan.nextLine();
							}while(nama.length() < 5);
							do {
								System.out.println("Input license:");
								license = scan.nextLine();
							}while(!license.matches("[A-Z] \\d{1,4} [A-Z]{1,3}"));
							do {
								System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
								speed = scan.nextInt();
							}while(speed < 99 || speed > 251);
							do {
								System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
								gas = scan.nextInt();
							}while(gas < 29 || gas > 61);
							do {
								System.out.println("Input wheel [4 <= gasCap <= 6]: ");
								wheel = scan.nextInt();
							}while(wheel < 3 || wheel > 7);
							scan.nextLine();
							do {
								System.out.println("Input type [SUV | Supercar | Minivan]: ");
								typecar = scan.nextLine();
							}while(!typecar.equals("SUV") && !typecar.equals("Supercar") && !typecar.equals("Minivan"));
							do {
								System.out.println("Input entertainment system amount [>= 1]: ");
								entertainment = scan.nextInt();
							}while(entertainment < 1);
							listMobil.add(new Mobil(tipe,brand,nama,license,speed,gas,wheel,typecar,entertainment));
						}
						if(tipe.equals("Motorcycle")) {
							flag = 2;
							do {
								System.out.println("Input brand [>= 5] :");
								brand = scan.nextLine();
							}while(brand.length() < 5);
							do {
								System.out.println("Input name [>= 5] :");
								nama = scan.nextLine();
							}while(nama.length() < 5);
							do {
								System.out.println("Input license:");
								license = scan.nextLine();
							}while(!license.matches("[A-Z] \\d\\d\\d\\d [A-Z][A-Z][A-Z]"));
							do {
								System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
								speed = scan.nextInt();
							}while(speed < 99 || speed > 251);
							do {
								System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
								gas = scan.nextInt();
							}while(gas < 29 || gas > 61);
							do {
								System.out.println("Input wheel [2 <= gasCap <= 3]: ");
								wheel = scan.nextInt();
							}while(wheel < 1 || wheel > 4);
							scan.nextLine();
							do {
								System.out.println("Input type [Automatic | Manual]: ");
								typemotor = scan.nextLine();
							}while(!typemotor.equals("Automatic") && !typemotor.equals("Manual"));
							do {
								System.out.println("Input jumlah helm [>= 1]: ");
								helm = scan.nextInt();
							}while(helm < 1);
							listMotor.add(new Motor(tipe,brand,nama,license,speed,gas,wheel,typemotor,helm));
						}
					}while(flag == 0);
				break;
				case 2:
					System.out.println("|No   |Type          |Name           |");
					for(int i = 0; i < listMobil.size();i++) {
						System.out.format("|" + "%-5d" + "|" + "%-14s|%-15s|\n",(i+1),listMobil.get(i).getTipe(),listMobil.get(i).getName());
					}
					for(int i = listMobil.size(); i < (listMobil.size() + listMotor.size());i++) {
						System.out.format("|" + "%-5d" + "|" + "%-14s|%-15s|\n",(i+1),listMotor.get(i-listMobil.size()).getTipe(),listMotor.get(i-listMobil.size()).getName());
					}
					int j = listMobil.size() + listMotor.size();
					do {
						System.out.println("Pick a vehicle number to test drive[Enter '0' to exit]:");
						pick = scan.nextInt();
						if(pick == 0) {
							break;
						}else {
							if(pick <= listMobil.size()) {
								Mobil c = listMobil.get(pick-1);
								c.turnon();
								System.out.println("Press enter to continue.");
								scan.nextLine();
								scan.nextLine();
							}else if(pick > listMobil.size() && pick <= j) {
								Motor c = listMotor.get(pick-1-listMobil.size());
								c.turnon();
								System.out.println("Input harga helm: ");
								harga = scan.nextInt();
								harga = harga*listMotor.get(pick-1-listMobil.size()).getHelm();
								System.out.println("Price : " + harga);
								System.out.println("Press enter to continue.");
								scan.nextLine();
								scan.nextLine();
							}
							
						}
					}while(pick > j);
				break;
				
			}
		}while(menu != 3);
		
		
		
		
	}

}
