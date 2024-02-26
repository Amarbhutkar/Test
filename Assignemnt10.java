package AssignmentsofGrotechminds;

//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. Multiply and divide in last two and call in main method.

public class Assignemnt10 {
	
	static void method1()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	static void method2()
	{
		int x=100;
		int y=80;
		int z=x-y;
		System.out.println(z);
	}
	
	void method3() {
		
		int l=25;
		int g=20;
		int f=l*g;
		System.out.println(f);
	}
	
	void method4()
	{
		int y=50;
		int h=25;
		int q=y/h;
		System.out.println(q);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		method2();
		
		Assignemnt10 o=new Assignemnt10();
		o.method3();
		o.method4();

	}

}
