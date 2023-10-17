import java.util.*;
public class labdemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the no. in a is "+a);
        System.out.println("the no. in b is "+b);
    }
    
}

