package Exp7_Shreyas.Patil;
/* Name : Shreyas Vithal Patil 
   Roll No : 18CE7006
   Batch : C-2
   Aim : Programmers can define their own packages to bundle group of related classes/interfaces as per their requirement. Create your own package 
         named as your "firstname.lastname" and encapsulate the Product class in it for recording and displaying the product information. Also import 
         the Product class to demonstrate the use of package.
 */
public class Product
{
    int Product_ID, quantity;
    double cost;
    public Product(int x,int y,double z)
    {
        Product_ID = x;
        quantity = y;
        cost = z;
    }
    public void display()
    {
        System.out.println("Product ID = "+ Product_ID);
        System.out.println("Quantity = "+ quantity);
        System.out.println("Cost = "+ cost);
        System.out.println("Total Cost = "+ quantity * cost);
    }
}
