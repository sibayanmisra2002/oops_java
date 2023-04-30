import java.io.*; class A
{
int x;
void increment()
{
x+=5;
}
}
class B extends A
{
void decrement()
{
x-=2;
}
}
class C extends B
{
void print()
{
System.out.println("From C: "+x);
}
}
 
public class program5
{
public static void main(String args[])
{
C ob = new C(); ob.increment(); ob.decrement(); ob.print();
}
}
