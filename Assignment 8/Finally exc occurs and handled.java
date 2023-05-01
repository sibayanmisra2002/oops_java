public class program8_3
{
static void calculate()
{
throw new ArithmeticException();
}
public static void main(String args[])
{
 
try
{
calculate();
}
 

catch(Exception e)
{
System.out.println("Exception Occurred");
}
finally
{
System.out.println("Finally Block");
}
System.out.println("Thank You");
}
}
