package odevlerOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("10 tane tamsayi giriniz: ");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
		removeDuplicate(list);

	}

	private static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) == list.get(j)) {
					list.set(j, list.get(list.size()-1));
					list.set(list.size()-1, null);

				}
			}
		}
		while(list.contains(null))
			list.remove(null);
		
		System.out.println(list);
	}


}
