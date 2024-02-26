package AssignmentsofGrotechminds;

//Create few constructor and call it in main method

public class Assignmnet8 {
	
	Assignmnet8()
	{
		int a=2;
		{
			System.out.println(a);
		}
	}
	
	Assignmnet8(int b,int c)
	{
		int sum= c+b;
		{
			System.out.println(sum);
		}
	}
	
	Assignmnet8(String g)
	{
		
			{
				System.out.println(g);	
			}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method 

		new Assignmnet8();
		new Assignmnet8(50,40);
		new Assignmnet8("Amar bhutkar");
	}

}
