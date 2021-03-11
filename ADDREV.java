import java.util.Scanner;

class ADDREV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int T=Integer.parseInt(sc.nextLine());
        while(T-->0){
            String[] str= sc.nextLine().split(" ");
            sb1.append(str[0]);
            sb2.append(str[1]);
            sb1=sb1.reverse();
            sb2=sb2.reverse();
            String s=Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString())+"";
            sb1.setLength(0);
            sb1.append(s);
            sb1=sb1.reverse();
            System.out.println(Integer.parseInt(sb1.toString()));
            sb1.setLength(0);
            sb2.setLength(0);
        }
        sc.close();
    }
}
