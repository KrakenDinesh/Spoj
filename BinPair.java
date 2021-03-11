import java.io.*;
import java.util.*;

public class BinPair {

    static int bs(int [] a,int l,int h,int k)
    {
        if(l<=h)
        {
            int m =(l+h)/2;
            if(a[m]==k) return m;
            else if(a[m]<k) return bs(a,m+1,h,k);
            else
                return bs(a,l,m-1,k);
        }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] a = new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int f=0;
            for(int i=0;i<n;i++)
            {
             int x=a[i]-k;
             int j=bs(a,0,n-1,x);
             if( j>-1 && i!=j)
                 f++;
            }
            System.out.println(f);
        sc.close();
    }
}
