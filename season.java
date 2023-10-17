import java.util.*;
public class season {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month name");
        String name=sc.next();

        switch(name){
            case "january":
            System.out.println("winter");
            break;

             case "february":
            System.out.println("winter");
            break;

             case "march" :
            System.out.println("spring");
            break;

             case "april":
            System.out.println("spring");
            break;

             case "may" :
            System.out.println("summer");
            break;

             case "june":
            System.out.println("summer");
            break;

             case "july":
            System.out.println("summer");
            break;

             case "august" :
            System.out.println("rainy");
            break;

             case "september":
            System.out.println("summer");
            break;

             case "october":
            System.out.println("summer");
            break;

             case "november" :
            System.out.println("winter");
            break;

             case "december":
            System.out.println("winter");
            break;

            default:
            System.out.println("wrong input");
        }
    }
}
