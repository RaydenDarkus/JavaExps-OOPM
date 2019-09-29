/* Name : Shreyas Vithal Patil
   Roll no : 18CE7006 
   Batch : C-2
   Aim : The purpose of an abstract class is to define some common behaviour that can be inherited by multiple 
         subclasses, without implementing the entire class. Create an abstract class with common behaviour of
         different shapes.
         
*/

public abstract class Exp12_Base
{
    float r,l,b,area;
    public abstract void calculate();
    public void display()
    {
        System.out.println("Area = "+ area);
    }
}