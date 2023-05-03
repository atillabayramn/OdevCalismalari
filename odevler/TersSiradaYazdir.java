package odevler;

import java.util.Scanner;

public class TersSiradaYazdir {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Sayı dizisi kaç elemanlı olsun? ");
		int diziSayisi = klavye.nextInt();

		double[] dizi = new double[diziSayisi];
		
		System.out.println("lutfen aralarında bir boşluk bırakarak "  + diziSayisi + " tane sayı giriniz : ");

		for (int i = 0; i < diziSayisi; i++) {
			
			dizi[i] = klavye.nextDouble();
		}
		
		System.out.println("Girdiğiniz sayıların ters sırada yazılmış hali: ");
		
		tersSiradaYazdir(dizi);

	}

	public static void tersSiradaYazdir(double[] dizi) {
		
		double[] tersDizi = new double[dizi.length];

		for (int i = 0, j = dizi.length - 1; i < dizi.length; i++, j--) {

			tersDizi[i] = dizi[j];
			
			System.out.print(tersDizi[i] + " ");
		}
	}
}
