import java.util.*;
public class Bank{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                String s = sc.nextLine();
                if(!hm.containsKey(s))
                 hm.put(s,1);
                else
                 hm.replace(s,hm.get(s));
            }
            for(Map.Entry<String,Integer> e:hm.entrySet())
             System.out.println(e.getKey()+" "+e.getValue()); 
        }
        sc.close();   
    }
}