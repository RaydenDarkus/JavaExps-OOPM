/* Name: Shreyas Vithal Patil
   Roll No: 18CE7006
   Aim: A character sequence is to be read as an input and result need to be declared as "yes" or "no" by investigating the fact that traversing the 
        character sequence backwards and forwards results in the same sequence. Write a program for the same using StringBuffer. 
 */
import java.util.*;
public class Exp9_S_Palin
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String x=sc.nextLine();
        StringBuffer sb = new StringBuffer(x);
        if(x.equalsIgnoreCase(sb.reverse().toString()))
        {
            System.out.println("The word is palindrome");
        }
        else
        {
            System.out.println("The word is not palindrome");
        }
    }
}
/*Output
  Enter the word
  Level
  The word is palindrome
 */