public class Exp15_MultiThread
{
	public static void main(String[] s)
	{
		Thread t1=new Thread(new Exp15_ThreadExample());
		Thread t2=new Thread(new Exp15_ThreadExample1());
		try
		{	
			t1.start();
            t1.join();
        	t2.start();
			t2.join();
        }	
        catch(Exception e)
		{
			System.out.println("InterruptedException");
		}	
	}
}
/*OUTPUT
Enter a number: 
12
144
*/
