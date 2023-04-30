class A
{
int x;
A()
{x=0;}
void initialize()
{
x=5;
}
}
class B extends A
{
B()
{super();} void print()
{
System.out.println("From B: "+x);
}
}
class C extends A
{
C()
{super();} void print()
{
System.out.println("From C: "+x);
}
}
public class program4
{
public static void main(String args[])
{
B	ob1 = new B(); ob1.initialize(); ob1.print();
C	ob2 = new C(); ob2.initialize(); ob2.print();
}
}
