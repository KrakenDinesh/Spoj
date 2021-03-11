import java.util.*;
import java.math.*;
public class Fence{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            double n = sc.nextDouble();
            if(n==0.0)
             break;
            else
            {
                System.out.printf("%.2f",((n*n)/(2*Math.PI)));
                System.out.println();
            }
        }
        sc.close();
        
    }
}