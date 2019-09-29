/*
    Name : Shreyas Vital Patil 
    Roll No : 18CE7006
    Batch : C-2
    Aim : Consider a university where students who participate in the National Games or Olympics are given 
    some grace marks. The grace marks provided are fixed and same for every student. Create an application 
    that keeps student’s Academic marks and Sports grace marks separate and generate  total of marks 
    considering academics and sports both. 
*/
import java.util.*;
public class Exp13_Student
{
    int roll_no;
    void getnumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number of the student");
        roll_no = sc.nextInt();
    }
    void putnumber()
    {
        System.out.println("Roll Number = "+roll_no);
    }
}