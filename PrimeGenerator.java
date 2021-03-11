import java.io.*;
import java.util.*;
import java.lang.Math.*;
 class Main {
    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);  
    	StringBuilder sb = new StringBuilder();   

        int[] primes = new int[4000];
        int numprimes = 0;
		int T,N,M;
        primes[numprimes++] = 2;
        for (int i = 3; i <= 32000; i+=2) {
            boolean isprime = true;

            for (int j = 0; j < numprimes; j++) {
                if (j > Math.sqrt(i)) break;
                if (i % primes[j] == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime)
            primes[numprimes++] = i;
        }
           T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            String[] s=br.readLine().split(" ");
            M=Integer.parseInt(s[0]);
            N=Integer.parseInt(s[1]);

            if (M < 2) M = 2;

            boolean[] isprime = new boolean[100001];
            for (int j = 0; j < 100001; j++) {
                isprime[j] = true;
            }

            for (int i = 0; i < numprimes; i++) {
                int p = primes[i];
                int start;

                if (p >= M) start = p*2;
                else start = M + (M % p==0?0:(p-M%p));

                for (int j = start; j <= N; j += p) {
                    isprime[j - M] = false;
                }
            }

            for (int i = M; i <= N; i++) {
                if (isprime[i-M]) 
                sb.append(i+"\n");
            }
        }
        System.out.print(sb.toString());
    }
}