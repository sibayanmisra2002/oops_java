interface A
{
abstract int sum(int a, int b);
}
class B implements A
{
public int sum(int a, int b)
{
return a+b;
}
}
public class program2
{
public static void main(String args[])
{
B	ob = new B(); System.out.println(ob.sum(5,6));
}
}
