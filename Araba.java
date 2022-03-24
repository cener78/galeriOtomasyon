package galeriOtomasyon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Araba extends Runner {
	Map<Integer, String>surusTalep=new HashMap<>();
	Map<Integer, String>aranacakMusteri=new HashMap<>();
	private String yakit;
	private String fren = "ABS";
	private String vites;
	private int motorGucu;
	private boolean camTavan;
	private boolean hizSabitleyici;
	private boolean sisFar;

	

	public abstract void move(String model);
	public  void getInfo(String model) {
		// TODO Auto-generated method stub
		
	}
	public  void kampanyalar(String model) {
		System.out.println("Pesinde %10 indirim");
		if (model.equals(BasicHonda.jazz.model)) {
			int indirimli = BasicHonda.jazz.getPrice() - (BasicHonda.jazz.getPrice() / 10);
			int indirim = (BasicHonda.jazz.getPrice() / 10);

			System.out.println("Fiyat...............:" + BasicHonda.jazz.getPrice() + "" + "\nIndirim.............:"
					+ indirim + "" + "\nKampanyali Fiyat....:" + indirimli);
		}
		if (model.equals(BasicHonda.civic.model)) {
			int indirimli = BasicHonda.civic.getPrice() - (BasicHonda.civic.getPrice() / 10);
			int indirim = (BasicHonda.civic.getPrice() / 10);

			System.out.println("Fiyat...............:" + BasicHonda.civic.getPrice() + "" + "\nIndirim.............:"
					+ indirim + "" + "\nKampanyali Fiyat....:" + indirimli);
		}
		if (model.equals(LuxHonda.jazzLux.model)) {
			int indirimli = LuxHonda.jazzLux.getPrice() - (LuxHonda.jazzLux.getPrice() / 10);
			int indirim = (LuxHonda.jazzLux.getPrice() / 10);

			System.out.println("Fiyat...............:" + LuxHonda.jazzLux.getPrice() + "" + "\nIndirim.............:"
					+ indirim + "" + "\nKampanyali Fiyat....:" + indirimli);
		}
		if (model.equals(LuxHonda.civicLux.model)) {
			int indirimli = LuxHonda.civicLux.getPrice() - (LuxHonda.civicLux.getPrice() / 10);
			int indirim = (LuxHonda.civicLux.getPrice() / 10);

			System.out.println("Fiyat...............:" + LuxHonda.civicLux.getPrice() + "" + "\nIndirim.............:"
					+ indirim + "" + "\nKampanyali Fiyat....:" + indirimli);
		}

	}

	void ozellikler(String model) {
		
		switch (model) {
		
		case "Jazz":
			getInfo(model);
			break;
		case "Civic":
			getInfo(model);
			break;
		case "JazzLux":
			getInfo(model);
			break;
		case "CivicLux":
			getInfo(model);
			break;

		default:System.out.println("dogru deger girmedin");
			break;
		}

	}

	static int num1=100;
	public void testSurusu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz");
		String isim=scan.next();
		System.out.println("Lutfen Soyisminizi Giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen e-mail adresinizi Giriniz");
		String email=scan.next();
		System.out.println("Lutfen Telefon Numaranizi Giriniz");
		String tlf=scan.next();
		System.out.println("Talebiniz alindi");
		
		String kunye=isim.concat(", "+soyisim).concat(", "+email).concat(", "+tlf);
		num1++;
		surusTalep.put(num1, kunye);
		System.out.println("Talep numaraniz: "+surusTalep.keySet());
	}
static int num2=0;
	public void bayiArasinMi() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz");
		String isim=scan.next();
		System.out.println("Lutfen Soyisminizi Giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen e-mail adresinizi Giriniz");
		String email=scan.next();
		System.out.println("Lutfen Telefon Numaranizi Giriniz");
		String tlf=scan.next();
		System.out.println("Musteri Temsilcilerimiz sizi en kisa surede arayacak \nHonda ile kalin.");
		
		String kunye=isim.concat(", "+soyisim).concat(", "+email).concat(", "+tlf);
		num2++;
		aranacakMusteri.put(num2, kunye);
		System.out.println("Talep numaraniz: "+aranacakMusteri.keySet());
	}

	public String getYakit() {
		return yakit;
	}

	public String getFren() {
		return fren;
	}

	public String getVites() {
		return vites;
	}

	public int getMotorGucu() {
		return motorGucu;
	}

	void setYakit(String yakit) {
		this.yakit = yakit;
	}

	void setFren(String fren) {
		this.fren = fren;
	}

	void setVites(String vites) {
		this.vites = vites;
	}

	void setMotorGucu(int motorGucu) {
		this.motorGucu = motorGucu;
	}

	public boolean isCamTavan() {
		return camTavan;
	}

	public boolean isHizSabitleyici() {
		
		return hizSabitleyici;
	}

	public boolean isSisFar() {
		return sisFar;
	}

	void setCamTavan(boolean camTavan) {
	
		
		this.camTavan = camTavan;
	}

	void setHizSabitleyici(boolean hizSabitleyici) {
		this.hizSabitleyici = hizSabitleyici;
	}

	void setSisFar(boolean sisFar) {
		this.sisFar = sisFar;
	}

	@Override
	public String toString() {
		return "Araba [yakit=" + yakit + ", fren=" + fren + ", vites=" + vites + ", motorGucu=" + motorGucu
				+ ", camTavan=" + camTavan + ", hizSabitleyici=" + hizSabitleyici + ", sisFar=" + sisFar + "]";
	}

}
