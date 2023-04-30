import java.io.*; class A
{
int x;
final void increment()
{
System.out.println("Called A"); x+=5;
}
}
class B extends A
{
void increment()
{
 
System.out.println("Called B"); x+=10;
}
}
public class program9
{
public static void main(String args[])
{
B ob1 = new B(); A ob2 = new A(); A ob3;
if (Integer.parseInt(args[0])==1) ob3=ob1;
else
ob3=ob2;
ob3.increment(); System.out.println(ob3.x);
}
}
