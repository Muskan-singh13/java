import java.util.*;
public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=25000.67;
        // double deposit=0;
        // double withdraw=0;
        System.out.println("enter your choice");
        System.out.println("1.deposit money\n 2.Check balance\n 3.withdraw money");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("enter the amount you want to deposit");
            double dep=sc.nextDouble();
            dep=balance+dep;
            System.out.println("your balance after deposit is " +dep);
            break;

            case 2:
            System.out.println("your  current balance is "+ balance);
            break;

            case 3:
            System.out.println("enter the amount you want to withdraw");
            double w=sc.nextDouble();
            w=balance-w;
            System.out.println("your balance after withdraw is "+ w);

            default:
            System.out.println("wrong input");
        }
    }
    
}
