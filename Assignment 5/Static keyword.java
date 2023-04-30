import java.io.*; public class program1
{
static int x; void increment()
{
x+=5;
}
public static void main(String args[])
{
program1 ob1 = new program1(); 
ob1.increment(); 
System.out.println(ob1.x); 
program1 ob2 = new program1(); 
ob2.increment(); 
System.out.println(ob2.x);
}
}
