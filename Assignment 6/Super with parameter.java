class A
{
A(int a)
{
System.out.println("Constructor of A: "+a);
}
}
class B extends A
{
B(int a,int b)
{
super(a);
System.out.println("Constructor of B: "+b);
}
}
public class program8
{
 
public static void main(String args[])
{
B ob = new B(5,6);
}
}
