import java.util.*;

public class calc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your choice");
    System.out.println("1.add 2.sub 3.mul 4.div");
    int choice = sc.nextInt();

    System.out.println("enter first no.");
    int a = sc.nextInt();

    System.out.println("enter second no.");
    int b = sc.nextInt();

    int res = 0;
    switch (choice) {
      case 1:
        res = a + b;
        System.out.println("the addition is");
        System.out.println(res);

        break;
      case 2:
        res = a - b;
        System.out.println("the subtraction is");
        System.out.println(res);

        break;

      case 3:
        res = a * b;
        System.out.println("the multiplication is");
        System.out.println(res);

        break;

      case 4:
        res = a / b;
        System.out.println("the division is");
        System.out.println(res);

        break;

      default:
        System.out.println("invalid input!!");

        break;

    }
    sc.close();
  }

}
