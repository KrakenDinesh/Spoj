import java.io.*;
import java.util.*;
import java.lang.Math.*;
class NumberStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==y||x-2==y)
                if((x&1)==0)
                    System.out.println(x+y);
                else
                    System.out.println(x+y-1);
            else
                System.out.println("No Number");
        }
        sc.close();
    }
}
