import java.util.*;
import  java.util.Scanner;

public class calculator
{
  public static void main(String[] arg)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("CALCULATOR!!\n\nOperations:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide!\n5.Modules\n");
    System.out.println("Enter any Operation name:");
    String choice=sc.nextLine();
   // System.out.println(choice);

    System.out.println("\nEnter Number 1:");
    float num1=sc.nextFloat();

    System.out.println("Enter Number 2:");
    float num2=sc.nextFloat();

    switch(choice)
    {
        case "Add":
        {
          float add=num1+num2;
          System.out.println(add);
          break;
        }

        case "Subtract":
        {
          float Subtract=num1-num2;
          System.out.println(Subtract);                                                    //using operator names
          break;
        }

        case "Multiply":
        {
            float Multiply=num1*num2;
            System.out.println(Multiply);
            break;
        }

        case "Divide":
        {
            float Divide=num1/num2;
            System.out.println(Divide);
            break;
        }

        case "Modules":
        {
            float Module=num1%num2;
            System.out.println(Module);
            break;
        }

        default:
        {
            System.out.println("Error !!");
        }
    }
  }
}





