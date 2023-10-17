 
import java.util.*;
public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number out of 100");
        int n=sc.nextInt();
        if(n<=100 && n>=90){
            System.out.println("this is very good");
        }else if(n<=89 && n>=80){
            System.out.println("this is also very good");
        }else if(n<=79 && n>=50){
            System.out.println("this is good");

        }else{
            System.out.println("yours isalso good because marks doesnt matter");
        }

    }
    
}