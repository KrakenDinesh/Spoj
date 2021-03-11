import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class FastMul
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String a=sc.next();
            String b=sc.next();
            BigInteger b1 = new BigInteger(a);
            BigInteger b2 = new BigInteger(b);
			/*bi=bi.multiply(BigInteger.valueOf(Long.parseLong(a)));
            bi=bi.multiply(BigInteger.valueOf(Long.parseLong(b)));*/
            System.out.println(b1.multiply(b2));
        }
        sc.close();
	}
}