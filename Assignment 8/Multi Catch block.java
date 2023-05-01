public class program4
{
static void calculate()
{
int a=1/0; System.out.println(a);
}
public static void main(String args[])
{
 
try
{
calculate();
}
 



 
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index not valid");
}
catch(ArithmeticException e)
{
System.out.println("Denominator is 0");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thank You");
}
}
