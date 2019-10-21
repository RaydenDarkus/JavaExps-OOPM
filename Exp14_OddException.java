/*
Name : Shreyas Vithal Patil
Roll No: 18CE7019
Batch: C-2
Aim: Through Custom exception user can raise application-specific error code. You are required to calculate a 
square of even number provided as input by user. However if a user provides an odd number as input, then an 
exception must be thrown explicitly with message indicating the input number must be even number. 
*/
class Exp14_OddException extends Exception
{
	public Exp14_OddException(String s){
		super(s);
	}
}