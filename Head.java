import java.util.*;

public class Head
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int rt=0,sh=0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)=='0')
             {
                 if(s.charAt(i+1)=='1')
                   rt++;
                else
                  sh++;
             }
        }
         if(s.charAt(n-1)=='0')
         {
             if(s.charAt(0)=='1')
              rt++;
             else
              sh++;
         }
         if(rt==0)
         {
         System.out.println("EQUAL");
         System.exit(0);
         }
        if(sh>rt)
         System.out.println("SHOOT");
        else if(rt>sh)
         System.out.println("ROTATE");
        else
        System.out.println("EQUAL");
        sc.close();
	}
}