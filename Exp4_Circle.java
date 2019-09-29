/*
Name: Shreyas Patil
Roll No: 18CE7006
Batch: C-2
Aim: The vendor provides a rubber material that provides protection to the edges of circular object and paper material for protection of front and
back of circular object. A vendor needs an application to calculate the amount of rubber and paper material required for covering circular 
object. Create an application with the methods to calculate area and circumference on provision of the radius of circular object to get the 
exact amount of rubber and paper.
 */
import java.util.*;
public class Exp4_Circle
{
    static float radius;
    public void getdata(float r)
    {
        radius=r;
    }

    public double area()
    {
        double area=radius*radius*3.14;
        return area;
    }

    public double circum()
    {
        double c=2*3.14*radius;
        return c;
    }

    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        Exp4_Circle ob=new Exp4_Circle();
        System.out.println("Enter the radius of the circle");
        float k=sc.nextFloat();
        ob.getdata(k);
        System.out.println("The amount of rubber required is "+ob.circum());
        System.out.println("The amount of paper required is "+ob.area()*2);
    }
}
/* Output
Enter the radius of the circle
3.5
The amount of rubber required is 21.98
The amount of paper required is 76.93
 */