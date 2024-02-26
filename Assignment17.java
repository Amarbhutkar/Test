package AssignmentsofGrotechminds;

//WAP with 4 constructors and 1 IIB

public class Assignment17 {
	
	Assignment17(int a)
	{
		System.out.println("Constructor 1");
	}
	
	Assignment17()
	{
		System.out.println("Constructor 2");
		
	}
	
	Assignment17(boolean a)
	{
		System.out.println("Constructor 3");
	}
	
	Assignment17(char a)
	{
		System.out.println("Constructor 4");
		
	}
	{
		System.out.println("This is IIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment17();
		new Assignment17(1);
		new Assignment17(true);
		new Assignment17('c');
		new Assignment17();
	}

}
