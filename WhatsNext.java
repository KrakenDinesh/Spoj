import java.io.*;
import java.util.*;
import java.lang.Math.*;
class WhatsNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        while(!end(arr)){
            if(arr[0]+arr[2]==2*arr[1])
            System.out.println("AP "+(arr[2]+(arr[1]-arr[0])));
            else
            System.out.println("GP "+(arr[2]*(arr[1]/arr[0])));
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
        }
        sc.close();
    }
    
    static boolean end(int[] arr){
        if(arr[0]==0&&arr[1]==0&&arr[2]==0)
        return true;
        return false;
    }
}
