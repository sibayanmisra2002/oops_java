import java.util.*; class A
{
int x;
void increment()
{
x+=5;
}
}
public class program3 extends A
{
public static void main(String args[])
{
program3 ob = new program3(); ob.increment(); System.out.println(ob.x);
}
}
