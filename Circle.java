  // An application that calculates area, circumference and diameter of a circle.
   
   import java.util.Scanner;

   public class Circle{
   public static void main(String []args){
   
    Scanner input = new Scanner(System.in);

   int radius;
   
   System.out.print("Enter radius:");
   radius = input.nextInt();

   System.out.printf("Diameter is %d\n", (2 * radius));  
   System.out.printf("Area is %f\n", (Math.PI * radius * radius));
   System.out.printf("Circumference is %f\n", (2 * Math.PI * radius));


}
}
  
   