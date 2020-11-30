  import java.util.Scanner;
   public class StudentsActualGrade{

    public static void main (String [] args){

    System.out.print ("Enter grade");
    Scanner input = new Scanner (System.in);
    
    int grade = input.nextInt();
    

   if (studentGrade>=90)
   System.out.println("A");

else
   if (studentGrade>=65)
    System.out.println("B");

else
if (studentGrade>=60)
System.out.println("C");

else
if (studentGrade>= 50)
Ststem.out.println("D");

else
System.out.println("F");

 
    
   

}
}