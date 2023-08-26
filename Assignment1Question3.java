*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************







public class Assignment1Question3
{
	public static void main(String[] args) {
		int n=7;
		for(int i=n-1;i>=0;i--)
		{
		    for(int j=0;j<n-i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=0;j<(2*i);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<n-i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		    
		}
		for(int i=0;i<(2*n);i++)
		{
		    System.out.print("*");
		}
	}
	
}
