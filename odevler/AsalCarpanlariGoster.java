package odevlerOOP;

import java.util.Scanner;

import bolum10.Yigin;

public class AsalCarpanlariGoster {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("asal çarpanlarını istediğiniz sayıyı giriniz: ");

		int sayi = klavye.nextInt();

		Yigin stack = new Yigin();

		for (int i = 2; i < sayi; i++) {
			
			int sayac = 0;
			
			while (sayi != 0) {
				if (sayi % i == 0 && asalMi(i)) {
					stack.push(i);
					sayi = sayi / i;
					
					sayac++;
				}else break;
			}
			sayi = sayi * (int)(Math.pow(i, sayac));
			
		}

		while (!stack.bosMu()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static boolean asalMi(int s) {
		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
			}
		}
		return true;
	}
}
