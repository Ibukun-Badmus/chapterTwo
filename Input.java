   // Prints the sum, product, difference and quotient of two numbers

    import java.util.Scanner; 

   public class Input{ 

   public static void main (String args[]){

   Scanner userInput;

   int firstNumber;
   int secondNumber;

   userInput = new Scanner(System.in);
   System.out.println("Enter firstNumber:");
   firstNumber = userInput.nextInt();

   System.out.println("Enter secondNumber:");
   secondNumber = userInput.nextInt();

      System.out.printf ("The sum is %d%n", firstNumber + secondNumber);

  System.out.printf("The product is %d%n", firstNumber * secondNumber);

System.out.printf("The quotient is %d%n", firstNumber / secondNumber);

System.out.printf("The modulus is %d%n", firstNumber % secondNumber);

}
}

   