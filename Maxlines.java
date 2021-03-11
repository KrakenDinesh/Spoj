import java.util.*;
public class Maxlines{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
         {
            double r = sc.nextDouble();
            System.out.println("Case "+i+": "+(4*r*r+0.25));
         }
        sc.close();
    }
}
