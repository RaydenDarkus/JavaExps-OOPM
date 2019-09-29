public class Exp13_Result extends Exp13_Test implements Exp13_Sports
{  
    public void putscore()
    {
        System.out.println("Score = "+score);
    }
    public void display()
    {
        System.out.println("Student Details :");
        putnumber();
        putmarks();
        putscore();
        System.out.println("Total Marks = "+(sem1+sem2+score));
    }
}