import java.util.*;
public class Exp13_Test extends Exp13_Student 
{
    float sem1,sem2;
    void getmarks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student in both semesters");
        sem1 = sc.nextFloat();
        sem2 = sc.nextFloat();
    }
    void putmarks()
    {
        System.out.println("Semester 1 Marks = "+sem1);
        System.out.println("Semester 2 Marks = "+sem2);
    }
}