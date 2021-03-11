import java.io.*;
import java.util.*;

public class Hypnos{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Set<Long> s = new HashSet<Long>();
        long a=sc.nextLong();
        long i=0;
        while(true)
        {
            if(s.contains(a))
            {
                System.out.println(-1);
                 break;
            }
            if(a==1)
             {
            System.out.println(i);
            break;
          }
            s.add(a);
             long sum=0,k=a;
             while(k>0)
            {
                long r=(k%10);
                k = k/10;
                sum = sum + r*r;
            }
            i++;
            a=sum;
        }
        sc.close();
    }
}
