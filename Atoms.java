import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Atoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int i=1;
            BigInteger n = new BigInteger(sc.next());
            BigInteger k = new BigInteger(sc.next());
            BigInteger m = new BigInteger(sc.next());
            while(k.pow(i).multiply(n).compareTo(m)<=0)
             i++;
             System.out.println(i-1);
        }
    }
}