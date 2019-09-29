/*
 * Name : Shreyas Vithal Patil 
 * Roll No : 18CE7006
 * Batch : C-2
 * Aim: An encoder requires a console based application that reads the integer and performs the arithmetic right shift operation on it so that sign bit 
   of entered number is well preserved . The input to the application can be given while launching console based application or in an interactive way.
 */
import java.util.*;
public class Exp1_Input2
{
   public static void main(String[] s)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number");
       int a=sc.nextInt();
       System.out.println("Enter the second number");
       int b=sc.nextInt();
       System.out.println(a+" >> "+b+" = "+ (a>>b));
   }
}
/*Output - 
  Enter the first number
  23
  Enter the second number
  3
  23 >> 3 = 2
*/