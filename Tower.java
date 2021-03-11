import java.util.*;

public class Tower
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m = sc.nextInt();
            int k=sc.nextInt();

            /* PriorityQueue<Integer> a = new PriorityQueue<Integer>(Collections.reverseOrder());
            // for(int i=0;i<n;i++)
            //  a.add(sc.nextInt());
            // boolean flag = true;
            // for(int i=0;i<m;i++)
            //  {
            //      int h = a.poll()-k;
            //      if(h<=0)
            //      {
            //       flag = false;
            //       break;
            //      }
            //  }
            //  if(flag)
            //   System.out.println("YES");
            //  else
              System.out.println("NO");*/
             int a[] = new int [n];
             int c=0;
             for(int i=0;i<n;i++)
              {
                  a[i] = sc.nextInt();
                  if((a[i]=a[i]-k)>0)
                   c++;
              }
              if(c>=m)
               System.out.println("YES");
               else
               System.out.println("NO");
        }
        sc.close();
	}
}



// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;

// /**
//  * SPOJ Problem: DOTA Heroes(DOTAA)
//  * Efficient I/O required. DO NOT use scanner. Make sure to take care of tricky test cases like:
//  * 4 3 400
//  * 200
//  * 200
//  * 200
//  * 1201
//  * @author madhurbhargava
//  *
//  */
// public class DOTAA {

	
// 	public static void main(String[] arguments) throws Exception
// 	{
// 		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// 		PrintWriter out = new PrintWriter(System.out);
// 		int numTestCases = Integer.parseInt(reader.readLine());
// 		for(int i = 0; i < numTestCases; i++)
// 		{
// 			String[] data = reader.readLine().split(" ");
// 			int numHeroes = Integer.parseInt(data[0]);
// 			int numTowers = Integer.parseInt(data[1]);
// 			int tDamage = Integer.parseInt(data[2]);
// 			boolean reach = false;
// 			//As per prob specs, number of towers is always less than or equal to number of heroes
// 			for(int j = 0; j < numHeroes; j++)
// 			{
// 				int heroPower = Integer.parseInt(reader.readLine());
// 				if(heroPower > tDamage)
// 				{
// 					double sustain = (double)heroPower/(double)tDamage;
// 					if(isWhole(sustain))
// 					{
// 						sustain = sustain - 1;
// 					}
// 					else
// 					{
// 						sustain = Math.floor(sustain);
// 					}
// 					numTowers = (int) (numTowers - sustain);
// 				}
				
// 				if(numTowers <= 0)
// 				{
// 					reach = true;
// 				}
// 			}
// 			if(reach)
// 			{
// 				out.println("YES");
// 			}
// 			else
// 			{
// 				out.println("NO");
// 			}
// 			out.flush();
// 		}
// 	}
	
// 	private static boolean isWhole(double value) {
// 	    return Math.floor(value) == value;
// 	}
// }
// © 2021 GitHub, Inc.
// Terms
// Privacy
// Security
// Status
// Docs
// Contact GitHub
// Pricing
// API
// Training
// Blog
// About
