import java.util.*;
public class Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
             a[i] = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        ArrayList<Integer> b = new ArrayList<>();
        int i = 0;
        for (; i < k; i++)
            q.add(a[i]);
         b.add(q.peek());
         q.remove(a[0]);
        for (; i < n; i++) {
            q.add(a[i]);
            b.add(q.peek());
            q.remove(a[i-k+1]);
        }
        for(int j:b)
         System.out.print(j+" ");
     sc.close();
    }
}