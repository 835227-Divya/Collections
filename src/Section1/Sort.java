package Section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<Integer>();
		System.out.println("Sample output");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			List.add(input);
		}
		System.out.println("Smple output");
		Collections.sort(List);
		ListIterator<Integer> li = List.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		sc.close();
	}
}
