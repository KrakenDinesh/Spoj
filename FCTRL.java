import java.io.*;
import java.util.*;
import java.lang.Math.*;
class FCTRL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
           int val= sc.nextInt();
           int n=0;
           for(int i=1;(int)Math.pow(5,i)<=val;i++){
               n+=val/(int)Math.pow(5,i);
           }
           System.out.println(n);
        }
        sc.close();
    }
}
