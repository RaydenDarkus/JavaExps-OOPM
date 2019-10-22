import java.util.*;
class Exp15_ThreadExample implements Runnable
{
	Scanner sc=new Scanner(System.in);
	Exp15_Number ob=new Exp15_Number();
	public void run()
	{
		System.out.println("Enter a number:");
		ob.n=sc.nextInt();
	}	
}