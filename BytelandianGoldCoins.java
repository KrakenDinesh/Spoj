import java.io.*;
import java.util.*;
import java.lang.Math.*;/////////////////////////////////
class BytelandianGoldCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=1000000001/2;
        int[] dp =new int[size];
        for(int i=0;i<12;i++){
            dp[i]=i;
        }
        dp[12]=13;
        for(int i=13;i<size;i++){
            int val=dp[i/2]+dp[i/3]+dp[i/4];
            if(val>=dp[i])
            dp[i]=val;
        }
        while(sc.hasNext()){
            int money =sc.nextInt();
            int val=dp[money/2]+dp[money/3]+dp[money/4];
            if(val<money)
            val=money;
            System.out.println(val);
        }
        sc.close();
    }
}
