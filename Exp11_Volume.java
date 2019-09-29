public class Exp11_Volume extends Exp11_Area
{
    double v;  
    double volume()
    {
        v=radius*radius*radius*4/3*3.14;
        return v;
    }
    void display()
    {
        super.display();
        System.out.println("Volume = "+volume());
    }
    public void main()
    {
        Exp11_Volume ob=new Exp11_Volume();
        ob.GetData();
        ob.display();
    }
}

/*Output
  Enter the radius
  3.5
  Radius = 3.5
  Area = 38.465
  Volume = 179.5033373260498
 */