import java.util.*;

//import javax.lang.model.util.ElementKindVisitor14;
public class reverse {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int r;
        int temp;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("the reverse of no. is");
        System.out.println(s);
        if(s==temp)
        System.out.println("number is palindrome");
        else
        System.out.println("number is not palindrome");
        sc.close();
    }
    
}

