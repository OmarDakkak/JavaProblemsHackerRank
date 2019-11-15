package omardakkak;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this
            String num = String.format("%03d", x);
            System.out.printf("%-15s%s%n", s1, num);
        }
        System.out.println("================================");

    }
}
