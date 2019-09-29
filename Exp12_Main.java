import java.util.*;
public class Exp12_Main 
{
    public static void main(String[] s) 
    {
        Scanner sc = new Scanner(System.in);
        float x,y;
        System.out.println("Circle");
        System.out.println("Enter the radius");
        x = sc.nextFloat();
        Exp12_Circle12 ob = new Exp12_Circle12();
        ob.read(x);
        ob.calculate();
        ob.display();
        System.out.println("Rectangle");
        System.out.println("Enter the length and breadth");
        x = sc.nextFloat();
        y = sc.nextFloat();
        Exp12_Rectangle ob1 = new Exp12_Rectangle();
        ob1.read(x,y);
        ob1.calculate();
        ob1.display();
        System.out.println("Triangle");
        System.out.println("Enter the height and breadth");
        x = sc.nextFloat();
        y = sc.nextFloat();
        Exp12_Triangle ob2 = new Exp12_Triangle();
        ob2.read(x,y);
        ob2.calculate();
        ob2.display();
    }
}
/*  Output:
    Circle
    Enter the radius
    2.5
    Area = 19.625
    Rectangle
    Enter the length and breadth
    3.4 2.3
    Area = 7.82
    Triangle
    Enter the height and breadth
    5.4 3.8
    Area = 10.26
*/
