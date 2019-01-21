import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double plus=0;
        double minus =0;
        double zero =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]<0)
            {
                minus++;
            }
            else{
                plus++;
            }

        }
        double a = plus/arr.length;
        double b =minus/arr.length;
        double c = zero/arr.length;


        DecimalFormat dec = new DecimalFormat("#0.000000");
        System.out.println(dec.format(a));
        System.out.println(dec.format(b));
        System.out.println(dec.format(c));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
