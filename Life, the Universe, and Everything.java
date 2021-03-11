import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        while(input!=42){
            System.out.println(input);
            input=sc.nextInt();
        }
        sc.close();
	}
}