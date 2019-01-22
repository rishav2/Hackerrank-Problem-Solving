import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String a =s.substring(0,2);
        int b = Integer.parseInt(a);
        String c = s.substring(2,8);
        String d = s.substring(8);
        int add =0;
           if(d.equals("AM"))
           {
               if(b>=1 && b<=11)
               {
               return a+c;
               }
               else if( b==12)
               {
                   return "00"+c;
               }
           }
           else if (d.equals("PM"))
           {
               if(b==12)
               {
                   return a+c;
               }
               else{
                 add=b+12;
                 return add+c;
               }
           }
    
      
return null;

    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

 
