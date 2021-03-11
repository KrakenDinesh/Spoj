import java.io.*;
import java.util.*;

class Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
			int m = sc.nextInt();
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			int[] a = new int[n];

			for(int i = 0; i< n; i++){
				a[i] = sc.nextInt();
				if(a[i] > max1){
					max1 = a[i];
				}
			}
			int[] b = new int[m];
			for(int i = 0; i<m; i++){
				b[i] = sc.nextInt();
				if(b[i] > max2){
					max2 = b[i];
				}
			}
			if(max1 >= max2)
				System.out.println("Godzilla");
			else
				System.out.println("MechaGodzilla");
		}
        sc.close();
    }
}