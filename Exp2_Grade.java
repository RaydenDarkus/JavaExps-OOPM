/*
 * Name : Shreyas Vithal Patil 
 * Roll No. :18CE7006
 * Batch: C-2
 * Aim: The grading system describes how well students have achieved learning objectives or goals established for a class of course of study. This 
   system helps to categorize the students according to their grades. Design a system that reads marks obtained by  a student in a test of 100 marks
   and assign the grade as per the following criteria.
   Marks    Grade
   
   0-39     Fail
   40-49    Pass
   50-59    Second Class
   60-69    First Class
   70-100   Distinction
 */
import java.util.*;
public class Exp2_Grade
{
    public static void main(String[] s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks out of 100");
        int marks=sc.nextInt();
        switch(marks/10)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            System.out.println("The student has failed");
            break;
            case 4:
            System.out.println("The student has passed");
            break;
            case 5:
            System.out.println("The student has secured Second Class");
            break;
            case 6:
            System.out.println("The student has secured First Class");
            break;
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("The student has secured distinction");
            break;
            default:
            System.out.println("Enter the correct marks");
        }
    }
}
/*Output - 
  Enter the Marks out of 100
  78
  The student has secured distinction
 */