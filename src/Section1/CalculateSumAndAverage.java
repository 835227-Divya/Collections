package Section1;

import java.util.ArrayList;
import java.util.Scanner;


public class CalculateSumAndAverage {
	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		int temp = 0;
		float avg = 0.0f;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			input = sc.nextInt();
			List.add(input);
		}
		for (Integer integer : List) {
			temp = temp + integer;
		}
		System.out.println(temp);
		avg = (float) temp / n;
		System.out.printf("%.2f", avg);
		sc.close();

	}

}
