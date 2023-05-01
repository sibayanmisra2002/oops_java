public class program7
{
static void calculate() throws ArithmeticException
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
System.out.println(e);
}
System.out.println("Thank You");
}
}
