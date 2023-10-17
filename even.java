import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no upto you want to print the series"  );
        // System.out.println("the odd series is: ");
        int n=sc.nextInt();
         System.out.println("the odd series is: ");
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
        System.out.println("the even series is:");
        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    
}
