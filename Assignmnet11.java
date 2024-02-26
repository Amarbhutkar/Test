package AssignmentsofGrotechminds;

//WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, second method argument is double a,third method argument is char a, fourth method argument is boolean a and fifth method argument is String a

public class Assignmnet11 {
	
	
	static void method(int a)
	{
		System.out.println("run method 1");
	}
	
	static void method(double a)
	{
		System.out.println("run method 2");
	}
	
	static void method(char a)
	{
		System.out.println("run method 3");
	}
	
	void method(boolean a)
	{
	  System.out.println("run method 4");
	}
	
	void method(String a)
	{
		System.out.println("run method 5");
	}
	
	
	public static void main(String[] args) {
		
		method(2);
		method(23.5);
		method('s');
		Assignmnet11 o=new Assignmnet11();
		o.method(false);
		o.method("amar");
		
	}

}
