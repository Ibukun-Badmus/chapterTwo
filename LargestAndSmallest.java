
// An application that displays largest and smallest from the group.

import java.util.Scanner;

   public class LargestAndSmallest{
   
   public static void main (String[]args){

   int number1;
   int number2;
   int number3;
   int number4;
   int number5;
   int smallest;
   int largest;

   Scanner input = new Scanner (System.in);

   System.out.print("Enter first integer:");
    number1 = input.nextInt();

  System.out.print("Enter second integer:");
   number2 = input.nextInt();

  System.out.print("Enter third integer:");
   number3 = input.nextInt();

   System.out.print("Enter fourth integer:");
    number4 = input.nextInt();
  
   System.out.print("Enter fifth integer:");
   number5 = input.nextInt();

   smallest = number1;
   largest = number1;

   if (number2 < number1)
    smallest = number2;

   if (number3 < number1)
       smallest = number3;

    if (number4 < number1)
      smallest = number4;

    if(number5 < number1)
      smallest = number5;


   if (number2 > number1)
      largest = number2;
   
    if (number3 > number1)
       largest = number3;

    if (number4 > number1)
       largest = number4;
    
     if (number5 > number1)
      largest = number5; 

   System.out.printf("Largest of five integers is %d, and smallest is %d%n", largest, smallest);

}
}
 