import java.io.*; class A
{
int x;
void increment()
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
class C extends B
 
{
void print()
{
System.out.println("From C: "+x);
}
}
public class program7
{
public static void main(String args[])
{
C ob = new C(); ob.increment(); ob.print();
}
}

