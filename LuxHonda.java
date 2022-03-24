package galeriOtomasyon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuxHonda extends Araba implements DisAraba,IcAraba {
	public LuxHonda() {
		
	}
	
	String marka = "Honda";
	String model;
	private int price;	
	static List<LuxHonda> lux = new ArrayList<>();

	public LuxHonda(String marka, String model, String yakit, String fren, String vites, int motorGucu,
			boolean camTavan,boolean hizSabitleyici, boolean sisfar, int price) {
	this.marka=marka;
	this.model=model;
	super.setYakit(yakit);
	super.setVites(vites);
	super.setMotorGucu(motorGucu);
	super.setCamTavan(camTavan);
	super.setHizSabitleyici(hizSabitleyici);
	super.setSisFar(sisfar);
	this.setPrice(price);
	}
	
	public static void main(String[] args) {
			
}
	void luxHonda(){
		System.out.println("<<ILHAMINI KENDISINDEN ALAN YENI NESIL>>");
		System.out.println("Honda Jazz  ====> 1\nHonda Civic ====> 2");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		if (t == 1) {
			for (int i = 0; i < LuxHonda.lux.size(); i++) {
				if (LuxHonda.lux.get(i).model.equals("JazzLux")) {
					aracMenu(LuxHonda.lux.get(i).model,lux);

				}
			}
		}

		else if (t == 2) {
			for (int i = 0; i < LuxHonda.lux.size(); i++) {
				if (LuxHonda.lux.get(i).model.equals("CivicLux")) {
					aracMenu(LuxHonda.lux.get(i).model,lux);

				}
			}
		} else {
			System.out.println("Yanlis deger");

		}

		
	}
	
	
	
	
	private void aracMenu(String model, List<LuxHonda> lux) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sehrin sevilen sakini");
		System.out.println("Fiyat ===============> 1" + "\nKampanyalar =========> 2" + "\nOzellikler ==========> 3"
				+ "\nTest Surusu =========> 4" + "\nBayimiz sizi arasin==> 5");

		int tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			
			for (int i = 0; i < lux.size(); i++) {
				if (lux.get(i).model.equals(model)) {

					System.out.println("" + lux.get(i).marka + " " + lux.get(i).model + "'in Fiyati:"
							+ lux.get(i).price + "TL");
				}
					
			}
			System.out.println("Ana Menu===>1");
			int a=scan.nextInt();
			if (a==1) {
				tercih();
			break;
			} else {System.out.println("Yanlis deger");

			}

			break;
			
		case 2:
			kampanyalar(model);
			System.out.println("Ana Menu===>1");
			a=scan.nextInt();
			if (a==1) {
				tercih();
			break;
			} else {System.out.println("Yanlis deger");

			}

			break;
		case 3:
			ozellikler(model);
			System.out.println();
			System.out.println("Ana Menu===>1");
			a=scan.nextInt();
			if (a==1) {
			tercih();
			break;
			} else {System.out.println("Yanlis deger");

			}

			break;
		case 4:
			testSurusu();
			System.out.println("Ana Menu===>1");
			a=scan.nextInt();
			if (a==1) {
			tercih();
			break;
			} else {System.out.println("Yanlis deger");

			}

			break;
		case 5:
			bayiArasinMi();
			System.out.println("Ana Menu===>1");
			a=scan.nextInt();
			if (a==1) {
			tercih();
			break;
			} else {System.out.println("Yanlis deger");

			}
			
			break;

		default:System.out.println("Dogru bir deger girmediniz");
		
			break;
			
		}
	
		
	}

	@Override
	public void direksiyon(String model) {
		System.out.println();
		
	}

	@Override
	public void koltuk(String model) {
		System.out.println("Koltuk Sayisi: 4 ");

	}

	@Override
	public void klima(String model) {
		System.out.println("Klima: Tum Lux modellerimiz klimalidir");
		
	}

	@Override
	public void kapi(String model) {
		System.out.println("Kapi: Lux Honda 5 Kapi,Otamatik kilit sistemi");
	}

	@Override
	public void move(String model) {
		if (model.equals(jazzLux.model)) {
			System.out.println("Hiz: 300km/saat");
			
		}
		if (model.equals(civicLux.model)) {
			System.out.println("Hiz: 400km/saat");
			
		}		
	}

	

	

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void getInfo(String model) {

		for (int i = 0; i < lux.size(); i++) {
			if (model.equals(lux.get(i).model)) {
				System.out.println("Basic"+lux.get(i).marka+" "+lux.get(i).model);
				System.out.println("<================OZELLIKLERI=============>");
				System.out.println("Fiyat: "+lux.get(i).getPrice());
				System.out.println("Fren: "+lux.get(i).getFren());
				System.out.println("Motor: "+lux.get(i).getMotorGucu()+"\nVites: "+lux.get(i).getVites());
				System.out.println("Yakit: "+lux.get(i).getYakit()+"\nCam Tavan: "+lux.get(i).isCamTavan());
				System.out.println("Hiz Sabitleyici: "+lux.get(i).isHizSabitleyici()+"\nSis Fari: "+lux.get(i).isSisFar());
				lux.get(i).direksiyon(model);
				lux.get(i).kapi(model);
				lux.get(i).klima(model);System.out.println();
				lux.get(i).koltuk(model);
				lux.get(i).move(model);System.out.println();	
			}
		}
		
	
	}	
}
