//An application that inputs five numbers and prints the number of negatives, positives and zeros.


  import java.util.Scanner;

  public class Values{
  
  public static void main (String[]args){
  
  Scanner input = new Scanner(System.in);
  int number1;
  int number2;
  int number3;
  int number4;
  int number5;
  int totalNeg=0;
  int totalPos=0;
  int totalZero=0;

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

  if(number1 < 0)
  totalNeg = totalNeg + 1;

  if(number2 < 0)
   totalNeg = totalNeg + 1;

   if(number3 < 0)
   totalNeg = totalNeg + 1;

  if(number4 < 0)
   totalNeg = totalNeg + 1;

   if(number5 < 0)
   totalNeg = totalNeg + 1;


  if(number1 > 0)
   totalPos = totalPos + 1;

  if(number2 > 0)
   totalPos = totalPos + 1;

  if(number3 > 0)
   totalPos = totalPos + 1;

  if(number4 > 0)
   totalPos = totalPos + 1;

  if(number5 > 0)
   totalPos = totalPos + 1;


  if(number1 == 0)
    totalZero = totalZero + 1;

  if(number2 == 0)
    totalZero = totalZero + 1;

  if(number3 == 0)
    totalZero = totalZero + 1;

   if(number4 == 0)
    totalZero = totalZero + 1;

   if(number5 == 0)
    totalZero = totalZero + 1;

   System.out.println();
   System.out.printf("Total negative numbers: %d\\n", totalNeg);
   System.out.printf("Total positive numbers: %d\\n", totalPos);
   System.out.printf("Total zero numbers: %d\\n", totalZero);

}
}
