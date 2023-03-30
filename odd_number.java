package TestPackage1;

public class odd_number {
	
		public static void main(String[]args)
		{
			int s=11;
			for (int f=1;f<=s;f++) // f = 1 to 11
			{
				if(f%2!=0)
				{
					System.out.println(f + " is an odd number");
				}
				else
				{
					System.out.println(f+ " is not an odd number");
				}
			}
		}
	}
