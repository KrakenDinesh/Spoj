import java.io.*;
import java.util.*;

public class Fashion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
             b[i]=sc.nextInt();
             Arrays.sort(a);
             Arrays.sort(b);
             int sum=0;
             for(int i=0;i<n;i++)
             {
                 sum+=a[i]*b[i];
             }
             System.out.println(sum);

        }
        sc.close();
    }
}