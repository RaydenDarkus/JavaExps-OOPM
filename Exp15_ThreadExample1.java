class Exp15_ThreadExample1 implements Runnable
{
	Exp15_Number ob1=new Exp15_Number();
	public void run()
	{
		System.out.println(ob1.n*ob1.n);
	}	
}