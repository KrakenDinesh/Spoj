import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Julka {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            BigInteger x = new BigInteger(sc.next());
            BigInteger n = new BigInteger(sc.next());
            BigInteger k = x.add(n);
            k=k.divide(BigInteger.valueOf(2));
            BigInteger na = x.subtract(n);
            na = na.divide(BigInteger.valueOf(2));
         System.out.println(k+"\n"+na);
       }
          sc.close();
    }
  }