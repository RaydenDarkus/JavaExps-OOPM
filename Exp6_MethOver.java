/*
Name : Shreyas Vithal Patil
Roll No: 18CE7006
Batch: C-2
Aim: A graphic designer paints area using shapes such as circle , rectangle , square and calculates the painting charges on the basis of area painted.
Thus a designer needs an application with area method for calculating area of different shape,for which dimensions will be provided.
 */
import java.util.*;
public class Exp6_MethOver
{
    int area(int a,int b)
    {
        int ar=a*b;
        return ar;
    }

    int area(int a)
    {
        int ar=a*a;
        return ar;
    }

    double area(float a)
    {
        double ar=3.14*a*a;
        return ar;
    }

    public static void main(String s1[])
    {
        Scanner sc=new Scanner(System.in);
        Exp6_MethOver ob=new Exp6_MethOver();
        int a,b,s;
        float r;
        System.out.println("Enter the choice for the painting shape\n1.Rectangle\n2.Square\n3.Circle");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the length and breadth of the rectangle");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("The area of the rectangle is "+ob.area(a,b));
                break;
            case 2:
                System.out.println("Enter the length of side of the square");
                s=sc.nextInt();
                System.out.println("The area of the square is "+ob.area(s));
                break;
            case 3:
                System.out.println("Enter the radius of the circle");
                r=sc.nextFloat();
                System.out.println("The area of the circle is "+ob.area(r));
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
/* Output
   Enter the choice for the painting shape
   1.Rectangle
   2.Square
   3.Circle
   3
   Enter the radius of the circle
   4.5
   The area of the circle is 63.585
 */