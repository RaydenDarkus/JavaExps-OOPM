public class Exp11_Area extends Exp11_Circle11
{
    double a;
    double area()
    {
        a=radius*radius*3.14;
        return a;
    }
    void display()
    {
        super.display();
        System.out.println("Area = "+area());
    }
}
