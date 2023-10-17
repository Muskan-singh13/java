import java.util.*;
public class sum {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("the sum of digit is");
        System.out.print(s);

    }
}

