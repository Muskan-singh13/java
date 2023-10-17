import java.util.*;
public class trafficlight {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the color");
    String color=sc.next();
    switch(color){
        case "red":
        System.out.println("stop");
        break;
        case "yellow":
        System.out.println("be ready");
        break;
        case "green":
        System.out.println("start");
        break;
        

    }
    
}
}