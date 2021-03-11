import java.util.*;
public class Accomodation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n-->0)
        { 
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((b-a)>=2)
             c++;
        }
        System.out.println(c);
    }
}