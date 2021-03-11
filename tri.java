import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class tri {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [] a = new int[m+2];
            a[0]=0;a[1]=1;
            for(int i=2;i<=m+1;i++)
             a[i]=a[i-2]+a[i-1];
             int sum=0;
            for(int i=n;i<=m;i++)
             sum=(sum%mod+a[i]%mod)%mod;
         System.out.println(sum);
       }
          sc.close();
    }
  }