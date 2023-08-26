**************
******
*****
****
***
**
*
**
***
****
*****
******
*******
**************







public class Assignment1Question4
{
	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++)
		{
		    if(i==0)
		    {
		        for(int j=0;j<(2*n);j++)
		        {
		            System.out.print("*");
		        }
		        
		    }
		    else
		    {
		        for(int j=0;j<n-i;j++)
		        {
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
		    if(i!=0)
		    {
		        for(int j=0;j<=n-i;j++)
		        {
		            System.out.print("*");
		        }
		    }
		    else
		    {
		        for(int j=0;j<(2*n);j++)
		        {
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		}
	
	}
	
}
