/* Name: Shreyas Vithal Patil
 * Roll No. : 18CE7006
 * Batch: C-2
 * Aim: An encoder requires a console based application that reads the integer and performs the arithmetic right shift operation on it so that sign bit 
   of entered number is well preserved . The input to the application can be given while launching console based application or in an interactive way.
 */
public class Exp1_Input
{
    public static void main(String s[])
    {
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int res=a>>b;
        System.out.println(a+" >> "+b+" = "+res);
    }
}
/*Output- 
 * 23 >> 3 = 2
 */
