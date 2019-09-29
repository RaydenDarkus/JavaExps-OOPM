/*
Name : Shreyas Vithal Patil
Roll No: 18CE7006
Batch: C-2
Aim: An electrical engineer needs a complex number calculator for performing the operation of addition of alternating current represented using 
     complex number. Create an application that takes 2 objects complex numbers as parameters and return the object which is addition of these 2 
     complex numbers.
 */
import java.util.*;
public class Exp5_Complex
{
    float x,y;
    Exp5_Complex()
    {
        x=0;
        y=0;
    }

    Exp5_Complex(float real,float img)
    {
        x=real;
        y=img;
    }

    public void display()
    {
        System.out.println("The addition of the complex numbers is "+x+" + i"+y);
    }

    Exp5_Complex sum(Exp5_Complex c1,Exp5_Complex c2)
    {
        Exp5_Complex c3=new Exp5_Complex(0.0f,0.0f);
        c3.x=c1.x+c2.x;
        c3.y=c1.y+c2.y;
        return c3;
    }

    public static void main(String s[])
    {
        Scanner sc= new Scanner(System.in);
        float x1,y1,x2,y2;
        System.out.println("Enter the values of the first number");
        x1=sc.nextFloat();
        y1=sc.nextFloat();
        System.out.println("Enter the values of the second number");
        x2=sc.nextFloat();
        y2=sc.nextFloat();
        Exp5_Complex A = new Exp5_Complex(x1, y1);
        Exp5_Complex B=new Exp5_Complex(x2,y2);
        Exp5_Complex C=new Exp5_Complex(0.0f,0.0f);
        C=C.sum(A,B);
        C.display();
    }
}
/*Output
Enter the values of the first number
2.3 3.4
Enter the values of the second number
3.4 7.1
The addition of the complex numbers is 5.7 + i10.5
 */
