import java.util.*;
public class Hept
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split(" ");
        String s2 = "0123456789ABCDEFG";
        int sum1=0,sum2=0;
        for(int i=0;i<s.length;i=i+2)
        {
        if(s[i]=="*")
         break;
           String t1 = s[i];
           String t2 = s[i+1];
           for(int j=0;j<t1.length();j++)
            {
              sum1=sum1+17*(s2.indexOf(t1.substring(j,j+1))+1);
            }
            for(int j=0;j<t2.length();j++)
            {
              sum1=sum1+17*(s2.indexOf(t2.substring(j,j+1))+1);
            }
        }
        if(sum1>sum2)
         System.out.println(">");
        else if(sum1==sum2)
        System.out.println("=");
       else
       System.out.println("<");
        sc.close();
	}
}