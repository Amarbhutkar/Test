package AssignmentsofGrotechminds;


//Create one constructor and call it in main method
public class Assignment7 {
	
	Assignment7()
	{
		int a=2;
		{
			System.out.println(a);
		}
	}
	
	Assignment7(int b,int c)
	{
		int sum= c+b;
		{
			System.out.println(sum);
		}
	}
	
	Assignment7(String g)
	{
		
			{
				System.out.println(g);	
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment7();
		new Assignment7(5,5);
		new Assignment7("amarbhutkar");

	}

}
