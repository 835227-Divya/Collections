package Section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Player> list=new ArrayList<Player>();
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the player name");
			String name=sc.nextLine();
			System.out.println("Enter the country name");
			String Country=sc.nextLine();
			System.out.println("Enter the skill");
			String skill=sc.nextLine();
			Player call=new Player(name,Country,skill);
			list.add(call);
		}
		PlayerBO player=new PlayerBO();
		player.displayAllPlayerDetails(list);
		sc.close();
		

	}

}
