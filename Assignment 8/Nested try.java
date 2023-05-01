public class program5
{
static void calculate()
{
int a=1/0; System.out.println(a);
}
public static void main(String args[])
{
 
try
{
 


try
{
calculate();
}
  
catch(ArithmeticException e)
{
 
System.out.println("Denominator is 0");
}
try
{
int a=Integer.parseInt("S");
}
 

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index not valid");
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thank You");
 
}
}
