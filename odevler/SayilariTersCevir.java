package odevler;

import java.util.Scanner;

public class SayilariTersCevir {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Tersten yazılmasını istediğini sayıyı giriniz: ");

		int sayi = klavye.nextInt();

		int tersSayi = tersCevir(sayi);

		System.out.println(sayi + " sayısının tersten yazılmış hali: " + tersSayi);
	}

	

	public static int tersCevir(int sayi) {
		
		int basamakSayisi = basamakSayisiBul(sayi);

			int tersi = 0;	
			int kuvvet = basamakSayisi;
			
		for (int i = 0; i < basamakSayisi; i++) {
			int basamak = sayi % 10;
			sayi = sayi / 10;
			
			int yeniSayi = basamak * (int) (Math.pow(10, (kuvvet - 1)));
			kuvvet-- ;
			tersi += yeniSayi;
			
		}
		return tersi;

	}

	public static int basamakSayisiBul(int sayi) {
		int bolum = 1;
		int n = 0;
		int basamakSayisi = 0;

		while (bolum > 0) {

			bolum = sayi / (int) (Math.pow(10, n));
			n++;
			basamakSayisi++;

		}

		
		return basamakSayisi - 1;
	}
}
