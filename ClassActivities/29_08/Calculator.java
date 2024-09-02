// Java program for simple calculator
import java.lang.*;
import java.util.Scanner;


// Driver class
public class Calculator {
   // main function
   public static void main(String[] args)
   {
      // Stores two numbers
      double num1, num2;

      // Take input from the user
      Scanner sc = new Scanner(System.in);

      // Take the inputs num1 and num2 and operator
      System.out.println("Enter the first number:");
      num1 = sc.nextDouble();

      System.out.println("Enter the second number:");
      num2 = sc.nextDouble();

      //add the operations
      System.out.println("Enter the operation to be performed(Use 1 for +, 2 for -, 3 for *, 4 for /):");
      int operation = sc.nextInt();

      // perform the operations and print the result
      switch (operation) {
         case 1:
            System.out.println("The result of addition is:");
            System.out.println(num1 + num2);
            break;

         case 2:
            System.out.println("The result of subtraction is:");
            System.out.println(num1 - num2);
            break;

         case 3:
            System.out.println("The result of multiplication is:");
            System.out.println(num1 * num2);
            break;

         case 4:
            System.out.println("The result of division is:");
            System.out.println(num1 / num2);
            break;

         default:
            System.out.println("Invalid operation");
            break;
      }      
   }
}
