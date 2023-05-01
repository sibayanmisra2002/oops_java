public class program2
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
 



 
catch(ArithmeticException e)
{
System.out.println("Denominator is 0");
}
System.out.println("Thank You");
}
}
