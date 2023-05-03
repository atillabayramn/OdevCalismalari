package odevlerOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Toplanmasini istediginiz 5 sayi giriniz: ");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(sum(list));
	}

	private static int sum(ArrayList<Integer> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		return sum;
	}

}
