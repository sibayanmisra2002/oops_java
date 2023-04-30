class A
{
int sum(int a, int b)
{
return a+b;
}
}
class B extends A
{
void print(int a, int b)
{
System.out.println("Sum= "+super.sum(a,b));
}
}
public class program6
{
public static void main(String args[])
{
B ob = new B(); ob.print(5,6);
}
}

