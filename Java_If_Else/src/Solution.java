import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isEven(int N){
        if (N%2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (!isEven(N)){
            System.out.println("Weird");
        }else{
            if (N<5){
                System.out.println("Not Weird");
            }else if (N<=20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }


        scanner.close();
    }
}