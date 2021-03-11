import java.util.*;

public class TransforTheExpression {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     LinkedList<Character> ll=new LinkedList<>();
     int T=sc.nextInt();
     sc.nextLine();
     while(T-->0){
         String str=sc.nextLine();
         for(int i =0;i<str.length();i++){
             Character chr=str.charAt(i);
            if(chr=='(')
                ll.addFirst(chr);
            else if(chr==')'){
                Character pop=ll.removeFirst();
                while(pop!='('){
                    System.out.print(pop);
                    pop=ll.removeFirst();
                }
            }
            else if(chr.toString().matches("^[a-z]$")){
                System.out.print(chr);
            }
            else{   
                while(!ll.isEmpty()&&priority(ll.getFirst())>=priority(chr)){
                    System.out.print(ll.removeFirst());
                }
                ll.addFirst(chr);
            }

         }
         while(!ll.isEmpty()){
             System.out.print(ll.removeFirst());
         }
         System.out.println("");
     } 
     sc.close();      
    }

    static int priority(Character c){
        if(c=='+')
        return 1;

        if(c=='-')
        return 2;

        if(c=='*')
        return 3;

        if(c=='/')
        return 4;

        if(c=='^')
        return 5;

        return 0;
    }
}
/*
3
(a+(b*c))
((a+b)*(z+x))
((a+t)*((b+(a+c))^(c+d)))
*/