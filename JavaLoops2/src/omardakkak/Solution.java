// remove this package
package omardakkak;

import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int number = a;
            for(int j=0; j<n; j++) {
                number += (Math.pow(2,j)*b);
                System.out.print(number+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
