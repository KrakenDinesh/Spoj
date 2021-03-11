import java.io.*;
import java.util.*;
import java.lang.Math.*;
class Feynman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T!=0){
            System.out.println((T*(T+1)*(2*T+1))/6);
            T=sc.nextInt();
        }
        sc.close();
    }
}
