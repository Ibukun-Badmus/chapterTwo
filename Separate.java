  //An application that breaks apart a five-digit number

   import java.util.Scanner;

   public class Separate{

   public static void main (String[]args){
    
    Scanner input = new Scanner(System.in);

    int number;
    int digit1;
    int digit2;
    int digit3;
    int digit4;
    int digit5;

    System.out.print("Enter five-digit integer:");
    number = input.nextInt();

   digit1 = number / 10000;
   digit2 = number % 10000/1000;
   digit3 = number % 10000 % 1000 /100;
   digit4 = number % 10000 % 1000 % 100 / 10;
   digit5 = number % 10000 % 1000 % 100 % 10;

 System.out.printf("Digits in %d are %d %d %d %d %d\n", number, digit1, digit2, digit3, digit4, digit5);
    
    
}

}