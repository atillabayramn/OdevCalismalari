package odevler;

import java.util.Scanner;

public class SayininBasamakDegerleriniToplama {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println(" Rakamlarının toplamını istediğiniz sayıyı giriniz: ");
		
		int sayi = klavye.nextInt();
		
		int toplam = rakamToplami(sayi);
		
		System.out.println(sayi+ " Sayısının rakamları toplamı: " + toplam);
		System.out.println(sayi + " Sayısı " + basamakSayisiBul(sayi) + " basamaklıdır");
		
	}

	public static int rakamToplami(int sayi) {
		int basamakSayisi = basamakSayisiBul(sayi);
		
		int toplam = 0;
		
		for (int i = 0; i < basamakSayisi ; i++) {
			int basamak = sayi % 10;
			
			toplam += basamak ;
			
			sayi = sayi / 10;
			
		}
		return toplam;
		
	}

	public static int basamakSayisiBul(int sayi) {
		int bolum = 1;
		int n = 0;
		int basamakSayisi = 0;
		
		while (bolum > 0) {
		
			bolum = sayi / (int)(Math.pow(10, n)) ;
			n++ ;
			basamakSayisi++ ;
			
		}
		
		return basamakSayisi - 1;
	}
}
