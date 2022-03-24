package galeriOtomasyon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BasicHonda extends Araba implements DisAraba, IcAraba {
	
	
	String marka = "Honda";
	String model;
	private int price;
	static List<BasicHonda> basic = new ArrayList<>();
	
	BasicHonda() {
		
	}
	
	public static void main(String[] args) {

	}
	
	public BasicHonda(String marka, String model, String yakit, String fren, String vites, int motorGucu,
			boolean camTavan, boolean hizSabitleyici, boolean sisfar, int price) {
		this.marka = marka;
		this.model = model;
		super.setYakit(yakit);
		super.setFren(fren);
		super.setVites(vites);
		super.setMotorGucu(motorGucu);
		super.setCamTavan(camTavan);
		super.setCamTavan(camTavan);
		super.setHizSabitleyici(hizSabitleyici);
		super.setSisFar(sisfar);
		this.setPrice(price);

	}

	

		void basicHonda() {

		System.out.println("<<ILHAMINI KENDISINDEN ALAN YENI NESIL>>");
		System.out.println("Honda Jazz  ====> 1\nHonda Civic ====> 2");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		if (t == 1) {
			for (int i = 0; i < BasicHonda.basic.size(); i++) {
				if (BasicHonda.basic.get(i).model.equals("Jazz")) {
				aracMenu(BasicHonda.basic.get(i).model,basic);

				}
			}
		}

		else if (t == 2) {
			for (int i = 0; i < BasicHonda.basic.size(); i++) {
				if (BasicHonda.basic.get(i).model.equals("Civic")) {
				aracMenu(BasicHonda.basic.get(i).model,basic);

				}
			}
		} else {
			System.out.println("Yanlis deger");

		}

	}

		public  void aracMenu(String model,List<BasicHonda> basic) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Sehrin sevilen sakini");
			System.out.println("Fiyat ===============> 1" + "\nKampanyalar =========> 2" + "\nOzellikler ==========> 3"
					+ "\nTest Surusu =========> 4" + "\nBayimiz sizi arasin==> 5");

			int tercih = scan.nextInt();
			switch (tercih) {
			case 1:
				
				for (int i = 0; i < basic.size(); i++) {
					if (basic.get(i).model.equals(model)) {

						System.out.println("" + basic.get(i).marka + " " + basic.get(i).model + "'in Fiyati:"
								+ basic.get(i).price + "TL");
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
	public void koltuk(String model) {
		System.out.println("Koltuk Sayisi: 4 ");

	}

	@Override
	public void klima(String model) {
		
		basic.stream().filter(t -> t.getMotorGucu() < 150).forEach(t -> System.out.print("Klima: Klima yok"));
	}

	@Override
	public void kapi(String model) {
		System.out.println("Kapi: Basic Honda 5 Kapi");

	}

	@Override
	public void move(String model) {
		if (model.equals(jazz.model)) {
			System.out.println("Hiz: 300km/saat");
			
		}
		if (model.equals(civic.model)) {
			System.out.println("Hiz: 400km/saat");
			
		}
	}

	@Override
	public void direksiyon(String model) {
		if (model.equals(jazz.model)) {
			System.out.println("Direksiyon: Hidrolik Direksiyon");
			
		}
		if (model.equals(civic.model)) {
			System.out.println("Direksiyon: Elektro Hidrolik Direksiyon");
			
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
		for (int i = 0; i < basic.size(); i++) {
			if (model.equals(basic.get(i).model)) {
				System.out.println("Basic"+basic.get(i).marka+" "+basic.get(i).model);
				System.out.println("<================OZELLIKLERI=============>");
				System.out.println("Fiyat: "+basic.get(i).getPrice());
				System.out.println("Fren: "+basic.get(i).getFren());
				System.out.println("Motor: "+basic.get(i).getMotorGucu()+"\nVites: "+basic.get(i).getVites());
				System.out.println("Yakit: "+basic.get(i).getYakit()+"\nCam Tavan: "+basic.get(i).isCamTavan());
				System.out.println("Hiz Sabitleyici: "+basic.get(i).isHizSabitleyici()+"\nSis Fari: "+basic.get(i).isSisFar());
				basic.get(i).direksiyon(model);
				basic.get(i).kapi(model);
				basic.get(i).klima(model);System.out.println();
				basic.get(i).koltuk(model);
				basic.get(i).move(model);System.out.println();	
			}
		}
		
	}

	
	

}
