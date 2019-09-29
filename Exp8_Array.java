/* Name : Shreyas Vithal Patil
 * Roll No: 18CE7006
 * Batch : C-2
 * Aim: 2D Array is used in many real life applications where we need to organize data in tabular/matrix format. Hence a matrix manipulator is
        required with the functionality of reading, displaying and fliping data from the matrix. Generate the methods for each functionality 
        mentioned above for creation of matrix manipulator. 
 */
import java.util.*;
public class Exp8_Array
{
    int i,j;
    void input(int x[][],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
    }

    void add(int x[][],int y[][],int n)
    {
        int[][] sum = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j]=x[i][j]+y[i][j];
            }
        }
        display(sum,n);
    }

    void transpose(int x[][],int n)
    {
        int[][] t=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                t[i][j]=x[j][i];
            }
        }
        display(t,n);
    }

    void display(int x[][],int n)
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        Exp8_Array ob=new Exp8_Array();
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        System.out.println("Enter the elements in the first array :");
        ob.input(a,n);
        System.out.println("The first array is :");
        ob.display(a,n);
        System.out.println("Enter the elements in the second array :");
        ob.input(b,n);
        System.out.println("The Second Array is :");
        ob.display(b,n);
        System.out.println("The Addition of both the arrays is :");
        ob.add(a,b,n);
        System.out.println("The transpose of the first array is :");
        ob.transpose(a,n);
    }
}

/*Output:
  Enter the size of the array :
  3
  Enter the elements in the first array :
  1 2 3 4 5 6 7 8 9 
  The first array is : 
  1 2 3  
  4 5 6  
  7 8 9  
  Enter the elements in the second array :
  2 4 2 1 6 5 7 8 9 
  The Second Array is :
  2 4 2  
  1 6 5  
  7 8 9  
  The Addition of both the arrays is :
  3  6  5  
  5  11 11  
  14 16 18  
  The transpose of the first array is :
  1 4 7  
  2 5 8  
  3 6 9  

*/