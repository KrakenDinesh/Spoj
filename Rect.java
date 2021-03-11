import java.util.*;
import java.lang.*;

public class Rect
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c= 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= Math.sqrt(i); j++){
				if(i%j==0){
					c++;
				}
			}
		}
		System.out.println(c);
              sc.close();
	}
}