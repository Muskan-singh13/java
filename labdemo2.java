import java.util.*;
public class labdemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a>b)?(a>c?"a is greater":"c is greater"):(b>c?"b is greater":"c is greater"));
    }
    
}