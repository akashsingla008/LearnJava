package pattern;

public class HomePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		 // Print i number of stars
        for (int i=1; i<=n; i++)
        {
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
 
            	for (int k = i*2-2; k < n*2-2; k++)
            	{
            		System.out.print(" ");
            	}
            
            	for (int l = 1; l <= i; l++)
            	{
            		System.out.print("*");
            	}
            System.out.println();
        }
	}
}
