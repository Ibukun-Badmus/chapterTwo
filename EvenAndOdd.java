   // An application that reads and integer and determines and prints whether it is odd or even.

 import java.util.Scanner;

  public class EvenAndOdd{
  
  public static void main (String[]args){

   Scanner input = new Scanner(System.in);
   
   int number;

   System.out.println("Enter a number:");
   number = input.nextInt();

   if(number(number)){
    System.out.println(number + "is even");
}

   else{
      System.out.println(number + "is odd");
}
}

  public static boolean number(int num){
  if((num%2)==0)
     return true;
   else
     return false;
}
}