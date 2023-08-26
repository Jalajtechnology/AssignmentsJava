
**************
****** *******
*****   ******
****     *****
***       ****
**         ***
*           **
*            *
*            *
*            *
*            *
*            *
*            *
**************







public class Assignment1Question1
{
	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<(2*n);i++)
		{
		    if(i==0)
		    {
		        for(int j=0;j<(2*n);j++)
		        {
		            System.out.print("*");
		        }
		    }
		    else if(i>0 && i<=n-1)
		    {
		        for(int j=0;j<(n-i);j++)
		        {
		            System.out.print("*");
		        }
		        for(int j=0;j<(2*i-1);j++)
		        {
		            System.out.print(" ");
		        }
		        for(int j=0;j<=n-i;j++)
		        {
		            System.out.print("*");
		        }
		    }
		    else if(i>0 && i>n-1)
		    {
		        if(i!=2*n-1)
		        {
		            for(int j=0;j<(2*n);j++)
		            {
		                if(j==0 || j==(2*n-1))
		                {
		                    System.out.print("*");
		                }
		                else
		                {
		                    System.out.print( " ");
		                }
		            }
		            
		        }
		        else if(i==(2*n-1))
		        {
		            for(int j=0;j<(2*n);j++)
		            {
		                System.out.print("*");
		            }
		            
		        }
		    }
		    System.out.println();
		        
		}
	
	}
}
