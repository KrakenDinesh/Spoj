import java.io.*;
import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long long int a=sc.nextLong();
            /*long sum=0;
            while(a!=0)
            {
                sum=sum+(1<<a);
                a=a-1;
            }*/
           //System.out.println(sum-1);
           System.out.println((1<<(a+1))-3);
         } 
         sc.close();
        }
    }
