public class program8_2
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
 

catch(ArrayIndexOutOfBoundsException e)
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
