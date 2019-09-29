import Exp7_Shreyas.Patil.*;
import java.util.*;
public class Exp7_Show
{
   public static void main(String s[])
   {
      Scanner sc = new Scanner(System.in);
      int i,q;
      double p;
      System.out.println("Enter product ID : ");
      i = sc.nextInt();
      System.out.println("Enter quantity of product :");
      q = sc.nextInt();
      System.out.println("Enter cost of product");
      p = sc.nextDouble();
      Product ob=new Product(i,q,p);
      ob.display();
   }
}
/*
   Output:
   Enter product ID :
   12345
   Enter quantity of product :
   3
   Enter cost of product
   57
   Product ID = 12345
   Quantity = 3
   Cost = 57.0
   Total Cost = 171.0
*/
