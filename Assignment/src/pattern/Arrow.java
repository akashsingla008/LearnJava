package pattern;

public class Arrow {

	 public static void main(String[] args)
	    {
	   
		 int n=5;		        
		        // Print i number of stars
		        for (int i=1; i<=n; i++)
		        {
		            for (int j = i; j <= n; j++)
		            {
		                System.out.print("*");
		            }
		            for (int k = 1; k <= i*2-2; k++)
		            {
		                System.out.print(" ");
		            }
		            for (int l = i; l <= n; l++)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        
		        for (int i = 1; i <= n; i++)
		        {
		            for (int j = i; j <= i; j++)
		            {
		                System.out.print("*");
		            }
		            for (int k = 1; k <= (n-1)*2; k++)
		            {
		                System.out.print(" ");
		            }
		            for (int l = i; l <= i; l++)
		            {
		                System.out.print("*");
		            }
		            
		            System.out.println();
		           
		        }
		        System.out.print("**********");
	    }
}
