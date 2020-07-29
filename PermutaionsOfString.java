import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class PermutaionsOfString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);
        String predef ="";
        posible(predef,str);
    }
    public static void posible(String pred,String s)
    {
        int n = s.length();
        if(n==0)
        {
            System.out.println(pred);
            return;
        }
        for(int i=0;i<n;i++)
        {
            posible(pred+s.charAt(i),s.substring(0,i)+s.substring(i+1,n));
        }
        
    }
}