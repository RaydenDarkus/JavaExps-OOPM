/*Name : Shreyas Vithal Patil 
  Roll No : 18CE7006
  Batch : C-2
  Aim : Inheritance provides code reusability. Create a multilevel inheritance to calcuate volume of sphere which makes use of the base class which 
        calculates the area of a circle and which in turn uses the radius provided by its base class.
 */
import java.util.*;
public class Exp11_Circle11
{
    float radius;
    
    void GetData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=sc.nextFloat();
    }

    void display()
    {
        System.out.println("Radius = "+radius);
    }
}
