/*
Name : Shreyas Vithal Patil
Roll No: 18CE7006
Batch: C-2
Aim: Admission section needs an application for storing the student information whenever new student come for admission.
	 Information such as name, roll no, age, contact no. etc. is required to be stored for each student and at the end of 
	 the day the list need to be displayed on screen for verification. Make use of the vector class method for adding new
	  student record.
*/
import java.util.*;
public class Exp10_Vect
{
	public static void main(String[] s)
	{		
		String x;
		int n,i,c;
		Scanner sc=new Scanner(System.in);
		Vector<String> v=new Vector<String>();
		System.out.print("Enter number of names to store: ");
		n=sc.nextInt();	
		for(i=0;i<n;i++)
		{
			System.out.print("Enter name("+(i+1)+"): ");
			x=sc.next();
		 	v.add(x);
		}		
		do
		{	
			System.out.print("Enter choice:\n1)Add new name\n2)Display name(s)\n3)Exit\n");
			c=sc.nextInt();
			if(c==1){
				System.out.print("Enter name: ");
				x=sc.next();
				v.addElement(x);
			}			
			else if(c==2){
				System.out.println("The names are :");
				c=v.size();				
				for(i=0;i<c;i++)
				{
					System.out.println(v.get(i));
				}
			}			
			else
			{
				System.out.println("Done");
				break;
			}
		}while(true);
	}
}
/*OUTPUT
Enter number of names to store: 3
Enter name(1): Rohan
Enter name(2): Adil
Enter name(3): Ashok
Enter choice:
1)Add new name
2)Display name(s)
3)Exit
1
Enter name: Akhil
Enter choice:
1)Add new name
2)Display name(s)
3)Exit
2
The names are :
Rohan
Adil
Ashok
Akhil
Enter choice:
1)Add new name
2)Display name(s)
3)Exit
3
Done
*/
