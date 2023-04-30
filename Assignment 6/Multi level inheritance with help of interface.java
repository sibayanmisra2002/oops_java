interface A
{
abstract int sum(int a, int b);
}
interface B extends A
{
abstract void print(int sum);
}
class C implements B
{
public int sum(int a, int b)
{
return a+b;
}
public void print(int sum)
{
System.out.println("Sum= "+sum);
}
}
public class program3
 
{
public static void main(String args[])
{
C	ob = new C(); ob.print(ob.sum(5,6));
}
}
