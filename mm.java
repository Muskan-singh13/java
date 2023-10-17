import java.util.*;
public class mm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary");
        int sal=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        float tax=0;
        if(sal<=10000){
            System.out.println("no tax");
        }
        else if(sal>10000 && sal<=25000){
            tax=0.1f*sal;
            System.out.println(tax);

        }else{
            System.out.println("no");
        }

        
    }
    
}
