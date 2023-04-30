abstract class A
{
 
A()
{
System.out.println("Constructor of A");
}
}
 
class B extends A
{ 
	B()
	{
		super(); 
		System.out.println("Constructor of B");
	}
}

public class program7
{
public static void main(String args[])
{
B ob = new B();
}
}
