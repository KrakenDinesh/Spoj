import java.io.*;
import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
           if(a>b && (a-b)==k)
            System.out.println("YES");
          else
          System.out.println("NO");
        }
        sc.close();
    }
}