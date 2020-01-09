package Section2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        double length=0;
        double width=0;
        double height=0;
        Scanner sc=new Scanner(System.in);
        Set<Box> set=new HashSet<Box>();
        System.out.println("Enter the number of Box");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter the box" + i+"details");
            System.out.println("Enter length");
            length=sc.nextDouble();
            System.out.println("Enter width");
            width=sc.nextDouble();
            System.out.println("Enter height");
            height=sc.nextDouble();
            Box call=new Box(length,width,height);
            call.setVolume(length, width, height);
            set.add(call);
            
        }
        System.out.println("Unique boxes in the sets are");
        for(Box box:set) {
            System.out.println(box.toString());
            
        }
        sc.close();

    }

}
