package odevler;

import java.util.Scanner;

public class UcSayiyiSırala {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("küçükten büyüğe sıralanmasını istediğiniz üç sayı giriniz: ");
		
		double sayi1 = klavye.nextDouble();
		double sayi2 = klavye.nextDouble();
		double sayi3 = klavye.nextDouble();
		
		sirala(sayi1, sayi2, sayi3);
	}

	public static void sirala(double sayi1, double sayi2, double sayi3) {
		
		double kucuk;
		double orta;
		double enKucuk;
		double buyuk;
		double enBuyuk;
		double ortanca;

		if (sayi1 < sayi2) {
			kucuk = sayi1;
			orta = sayi2;
		} 
		else {
			kucuk = sayi2;
			orta = sayi1;
		}
		
		if (kucuk < sayi3) {
			enKucuk = kucuk;
			buyuk = sayi3;
		} else {
			enKucuk = sayi3;
			buyuk = kucuk;
			
		}
		
		if (orta < buyuk) {
			ortanca = orta;
			enBuyuk = buyuk;
		}else {
			ortanca = buyuk;
			enBuyuk = orta;
		}
		
		System.out.println("Sayıların sıralanışı: " + enKucuk + " < " + ortanca + " < " + enBuyuk);
	}
}
