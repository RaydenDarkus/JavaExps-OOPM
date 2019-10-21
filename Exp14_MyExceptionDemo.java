import java.util.*;
public class Exp14_MyExceptionDemo {
    public static void main(String[] s)
    {
		Scanner sc=new Scanner(System.in);
		Exp14_Number ob=new Exp14_Number();
        try
        {
			System.out.print("Enter an even number: ");
			ob.num=sc.nextInt();
			ob.display();
		}
        catch(Exception e)
        {
			System.out.println(e.getMessage());
		}
	}	
}
/*OUTPUT
Enter an even number: 13
The number must be even number
*/
