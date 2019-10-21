class Exp14_Number
{
	int num;
	public void display()throws Exp14_OddException
	{
		if(num%2!=0)
		 throw new Exp14_OddException("The number must be even number");
		else
		 System.out.println(num+"^2: "+num*num); 
	}
}