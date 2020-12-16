   
//An application that inputs three integers and displays the sum, average, product, smallest and largest.

import java.util.Scanner;
   
   public class Largest{

   public static void main (String[]args){
   Scanner input = new Scanner(System.in);

    int number1;
    int number2;
    int number3;
    int sum;
    int average;
    int product;
    int smallest;
    int largest;

    System.out.print("Enter first integer:");
     number1= input.nextInt();

    System.out.print("Entersecond integer:");
    number2 = input.nextInt();
    
    System.out.print("Enter third integer:");
    number3 = input.nextInt();

    sum = number1 + number2 + number3;
    average = (sum) / 3;
    product = number1 * number2 * number3;

    smallest = number1;
    if (number2 <= number1)
    smallest = number2;

    if (number3 <= number1)
    smallest = number3;

    largest = number1;
    if (number2 >= number1)
      largest = number2;

     if (number3 >= number1)
      largest = number3;

    System.out.printf("Sum is %d\n", sum);
    System.out.printf("Average is %d\n", average);
    System.out.printf("Product is %d\n", product);
    System.out.printf("Smallest is %d\n", smallest);
    System.out.printf("largest is %d\n", largest);
}


 }