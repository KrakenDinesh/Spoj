import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Ngm {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==0)
         System.out.println(2);
        else
         System.out.println(1+"\n"+(n%10));
          sc.close();
    }
  }