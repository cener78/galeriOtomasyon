package galeriOtomasyon;

import java.util.List;
import java.util.Scanner;

public class Runner {
	public static BasicHonda jazz = new BasicHonda("Honda", "Jazz", "Benzin", "ABS", "Duz", 120, false, false, false,
			500000);
	public static BasicHonda civic = new BasicHonda("Honda", "Civic", "Dizel", "ABS", "Duz", 160, false, false, false,
			600000);
	public static LuxHonda jazzLux = new LuxHonda("Honda", "JazzLux", "Elektrikli", "ABS", "Otomatik", 100, true, true,
			false, 700000);
			
	public static LuxHonda civicLux = new LuxHonda("Honda", "CivicLux", "Hibrit", "ABS", "Otomatik", 200, true, true, true,
			800000);

	public static void main(String[] args) {
		BasicHonda.basic.add(jazz);
		BasicHonda.basic.add(civic);
		LuxHonda.lux.add(jazzLux);
		LuxHonda.lux.add(civicLux);
		

		Scanner scan = new Scanner(System.in);
		String start = "";
		do {
			System.out.println("Motoru Calistirmak icin ** H ** basiniz");
			start = scan.next();
		} while (!start.equalsIgnoreCase("h"));

		tercih();
		
	}

		static void tercih() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*******HONDA'YA HOS GELDINIZ*******");
		System.out.println("Basic Honda ====> 1\nLux Honda   ====> 2");
		int secim = scan.nextInt();
		switch (secim) {
		case 1:
			BasicHonda bhonda = new BasicHonda();
			bhonda.basicHonda();			
			break;

		case 2:
			LuxHonda lhonda = new LuxHonda();
			lhonda.luxHonda();

			break;

		default:
			System.out.println("Yanlis deger girdiniz");
			tercih();
			break;
		}

	}

}