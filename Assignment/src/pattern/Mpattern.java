package pattern;

public class Mpattern {

	public static void main(String[] args)
	{
		int n=7;
	  for (int i = n; i >= 1; i--)
      {
          for (int j = i; j >= 1; j--)
          {
        	  if(i==n)
              System.out.print("**");
        	  else
        		  System.out.print("*"); 
          }
          System.out.println();
      }

      for (int i = 2; i <= n; i++)
      {
          for (int j = i; j >= 1; j--)
          {
        	  if(i==n)
                  System.out.print("**");
            	  else
            		  System.out.print("*"); 
          }
          System.out.println();
      }
	}
	}
