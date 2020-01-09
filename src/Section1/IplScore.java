package Section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IplScore {

	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<Integer>();
		int input=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			input=sc.nextInt();
			List.add(input);
			
		}
			Collections.sort(List);
			for(Integer integer :List) {
				System.out.println(integer);
			
			}
			sc.close();
	}

}
