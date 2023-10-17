import java.util.*;
public class BMIcalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight and height in metre");
        float w=sc.nextFloat();
        float h=sc.nextFloat();
        float res=w/(h*h);
        System.out.println("BMI is "+res);
        if(res<=18.5){
            System.out.println("underweight");
        }
        else if(res>18.5 && res<=24.9){
            System.out.println("healthy");
        }
        else if(res>25 &&  res<=29.9){
            System.out.println("overweight");

        }
        else{
            System.out.println("obese");
        }

    }
}
