import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }
        else if(n<0){
            System.out.println("no. is negative");
        }
        else{
            System.out.println("no is zero");
        }
    }

    
}
