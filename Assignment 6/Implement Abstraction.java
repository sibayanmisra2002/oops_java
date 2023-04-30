abstract class A
{
abstract int sum(int a, int b);
}
class B extends A
{
int sum(int a, int b)
{
return a+b;
}
}
public class program1
{
public static void main(String args[])
{
B ob = new B(); System.out.println(ob.sum(5,6));
}
}

