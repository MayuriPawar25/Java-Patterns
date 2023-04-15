import java.util.*;
public class Pr
{
	public static void main(String args[])
	{
		//Basic Patterns
		/*
			*****
			*****
			*****
			*****
		*/
		/*int m=4;
		int n=5;

		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
	//____________________________________________________________________________

		/*
			* * * * *
			*		*
			*		*
			* * * * *
		*/	
			/*int m=5;
			int n=4;

			for(int i=1;i<=m;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==1 || j==1 || i==m || j==n )
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				System.out.println();
			}*/
	//_________________________________________________________________________

			/*
				half pyramid
				*
				**
				***
				****
				*****
			*/
				/*int n=4;
				for(int i=1;i<=n;i++)
				{
					for(int j=1; j<=i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}*/
	//_____________________________________________________________________________

				/*
					****
					***
					**
					*
				*/
					/*int n=4;
					for(int i=n;i>=1;i--)
					{
						for(int j=1;j<=i;j++)
						{
							System.out.print(" * ");
						}
						System.out.println();
					}*/
    //__________________________________________________________________________________
    
					/*
						54321
						8642
					    963
					    84
					    2

					*/
					/*int n=5;
					for (int i=1;i<=n;i++)
					{
						for (int j=n-i+1; j>=1;j--)
						{
							System.out.print(j*i);
						}
						System.out.println();
					}
					*/
					
	}
}