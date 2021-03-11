import java.io.*;
import java.util.*;
import java.lang.Math.*;
class Candy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T!=-1){
            int arr[]=new int[T];
            int num=0;
            for(int i=0;i<T;i++){
                arr[i]=sc.nextInt();
                num+=arr[i];
            }
            if(num%T!=0)
            System.out.println("-1");
            else{
                int moves=0;
                num=num/T;
                for(int i :arr){
                    if(i>num)
                    moves+=i-num;
                }
                System.out.println(moves);
            }
            T=sc.nextInt();
        }
        sc.close();
    }
}
